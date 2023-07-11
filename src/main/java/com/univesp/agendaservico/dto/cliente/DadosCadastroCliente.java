package com.univesp.agendaservico.dto.cliente;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;

public record DadosCadastroCliente(
        @CPF
        @NotBlank
        String cpf,

        @NotBlank
        String nome,

        @NotBlank
        String sobrenome,

        @NotBlank
        @Email
        String email,

        @NotBlank
        String senha

) {
}
