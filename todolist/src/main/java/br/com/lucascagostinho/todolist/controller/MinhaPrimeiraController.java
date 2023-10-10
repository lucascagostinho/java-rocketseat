package br.com.lucascagostinho.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//http:localhost:8080/primeiraRota/ ---------
@RequestMapping("/primeiraRota")
public class MinhaPrimeiraController {

    /**
     * Métodos de acesso HTTP
     * GET - Buscar uma informação
     * POST - Adicionar um dado/info
     * PUT - Alterar um dado/info
     * DELETE - Remover dado
     * PATCH - Alterar somente uma parte da info/dado
     *
     * @return
     */

    //Método (Funcionalçidade) de uma classe
    @GetMapping("/")
    public String primeiraMensagem() {
        return "Olá Mundo!";
    }

    @GetMapping("/primeiroMetodo")
    public String primeiraMetodo() {
        return "Primeiro Método!";
    }
}
