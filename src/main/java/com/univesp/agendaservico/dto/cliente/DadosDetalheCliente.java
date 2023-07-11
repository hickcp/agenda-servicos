package com.univesp.agendaservico.dto.cliente;

import com.univesp.agendaservico.entity.Cliente;
import com.univesp.agendaservico.entity.Endereco;

import java.util.List;

public record DadosDetalheCliente(String cpf, String nome, String sobrenome, String email, List<Endereco> enderecos) {
    public DadosDetalheCliente(Cliente cliente){
        this(cliente.getCpf(), cliente.getNome(), cliente.getSobrenome(), cliente.getEmail(), cliente.getEnderecos());
    }
}
