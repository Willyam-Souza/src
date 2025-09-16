package com.biblioteca.apibiblioteca.controller;

import com.biblioteca.apibiblioteca.model.Livro;
import com.biblioteca.apibiblioteca.repository.LivroRepository;
import com.biblioteca.apibiblioteca.service.LivroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping
    public List<Livro> listarTodosLivros(){
        return livroService.listarTodos();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Livro criarLivro(@Valid @RequestBody Livro livro){
        return livroService.salvar(livro);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Livro> buscarPorId(@PathVariable Long id) {
        return livroService.buscarPorId(id)
                .map(livroEncontrado -> ResponseEntity.ok(livroEncontrado))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarLivro(@PathVariable long id){
        if (!livroService.existePorId(id)) {
            return ResponseEntity.notFound().build();
        }
        livroService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Livro> atualizarLivro(@PathVariable Long id,@Valid @RequestBody Livro livroAtualizado) {
        return livroService.buscarPorId(id)
                .map(livroExistente -> {
                    livroExistente.setTitulo(livroAtualizado.getTitulo());
                    livroExistente.setAutor(livroAtualizado.getAutor());
                    livroExistente.setAnoDePublicacao(livroAtualizado.getAnoDePublicacao());
                    return ResponseEntity.ok(livroService.salvar(livroExistente)); // Use o service
                })
                .orElse(ResponseEntity.notFound().build());
    }


}
