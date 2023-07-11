package com.univesp.agendaservico.service;

import com.univesp.agendaservico.entity.Cliente;
import com.univesp.agendaservico.repository.ClienteRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ClienteServiceTest {

    @InjectMocks
    ClienteService clienteService;

    @Mock
    ClienteRepository clienteRepository;

    @Test
    void getAll() {

        var cliente = new Cliente(1l,"12345678910","João","Da Silva","joao@email.com","123",null,null);
        List<Cliente> clienteList = new ArrayList<>();
        clienteList.add(cliente);
        Mockito.when(clienteRepository.findAll()).thenReturn(clienteList);
        var response = clienteService.getAll();

        for(int i = 0; i < response.size(); i++){
            var responseInfo = response.get(i);
            var clienteInfo = clienteList.get(i);

            Assertions.assertEquals(responseInfo.cpf(), clienteInfo.getCpf());
            Assertions.assertEquals(responseInfo.nome(), clienteInfo.getNome());
            Assertions.assertEquals(responseInfo.sobrenome(), clienteInfo.getSobrenome());
            Assertions.assertEquals(responseInfo.email(), clienteInfo.getEmail());
            Assertions.assertEquals(responseInfo.enderecos(), clienteInfo.getEnderecos());
        }

    }
}