package com.univesp.agendaservico.controller;

import com.univesp.agendaservico.dto.cliente.DadosDetalheCliente;
import com.univesp.agendaservico.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping
    public ResponseEntity<List<DadosDetalheCliente>> getAll(){
        List<DadosDetalheCliente> detalhe = service.getAll();

        return ResponseEntity.ok(detalhe);
    }
}