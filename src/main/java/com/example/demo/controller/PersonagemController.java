package com.example.demo.controller;

import com.example.demo.model.Personagem;
import com.example.demo.service.PersonagemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * PersonagemController
 */
@RestController
@RequestMapping("/personagem")
@RequiredArgsConstructor
public class PersonagemController {

    @Autowired
    private PersonagemService personagemService;

    @GetMapping
    public Personagem buscarPersonagem() {
        return personagemService.buscarPersonagem();
    }

    @PostMapping("/dano/{dano}")
    public Personagem receberDano(@PathVariable int dano) {
        return personagemService.receberDano(dano);
    }

    @PostMapping("/recuperar/{quantidade}")
    public Personagem recuperarVida(@PathVariable int quantidade) {
        return personagemService.recuperarVida(quantidade);
    }
}