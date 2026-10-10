package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.model.Personagem;

/**
 * PersonagemService
 * Contém a lógica principal dos métodos da classe.
 */
@Service
public class PersonagemService {

    private final Personagem personagem = new Personagem("Guerreiro", 100);

    public Personagem receberDano(int dano) {

        int novaVida = personagem.getVida() - dano;

        novaVida = Math.max(novaVida, 0);
        personagem.setVida(novaVida);

        return personagem;
    }

    public Personagem recuperarVida(int quantidade) {

        int novaVida = personagem.getVida() + quantidade;

        novaVida = Math.min(novaVida, 100);
        personagem.setVida(novaVida);

        return personagem;
    }

    public Personagem buscarPersonagem() {
        return personagem;
    }
}