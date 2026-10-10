package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Personagem
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter // Já vão nos dar os getters e setters dos atributos da classe sem precisar
        // implementar.
public class Personagem {

    private String nome;
    private int vida;
}