package com.biblioteca.apibiblioteca.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "livros")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    @NotBlank(message = "O título não pode estar em branco")
    @Size(min = 2, max = 100, message = "O título deve conter entre 2 e 100 caracteres")
    private String titulo;

    @NotBlank(message = "O nome autor não pode estar em branco")
    @Size(max = 100, message = "O nome do autor não pode exeder 100 caracteres")
    private String autor;

    @NotNull
    @Min(value = 0, message = "O ano de publicação não pode ser negativo")
    private int anoDePublicacao;

}
