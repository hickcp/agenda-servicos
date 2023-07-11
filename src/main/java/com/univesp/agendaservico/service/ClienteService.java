package com.univesp.agendaservico.service;

import com.univesp.agendaservico.dto.cliente.DadosDetalheCliente;
import com.univesp.agendaservico.entity.Cliente;
import com.univesp.agendaservico.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;


    public List<DadosDetalheCliente> getAll(){
        List<Cliente> cliente = repository.findAll();
        List<DadosDetalheCliente> detalhes = cliente.stream().map( c -> new DadosDetalheCliente(c)).toList();
        return detalhes;

    }
}
