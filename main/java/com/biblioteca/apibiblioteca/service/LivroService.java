package com.biblioteca.apibiblioteca.service;

import com.biblioteca.apibiblioteca.model.Livro;
import com.biblioteca.apibiblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public List<Livro> listarTodos(){
        return livroRepository.findAll();
    }

    public Optional<Livro> buscarPorId(Long id){
        return livroRepository.findById(id);
    }

    public Livro salvar(Livro livro){
        return livroRepository.save(livro);
    }

    public void deletar(Long id){
        livroRepository.deleteById(id);
    }

    public boolean existePorId(Long id){
        return livroRepository.existsById(id);
    }

}
