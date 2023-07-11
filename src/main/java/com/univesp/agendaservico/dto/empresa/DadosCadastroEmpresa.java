package com.univesp.agendaservico.dto.empresa;

import com.univesp.agendaservico.entity.Endereco;
import com.univesp.agendaservico.entity.TipoEmpresa;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CNPJ;

public record DadosCadastroEmpresa(
        @CNPJ
        @NotBlank
        String cnpj,

        @NotNull
        TipoEmpresa tipoEmpresa,

        @Email
        @NotBlank
        String email,

        @NotBlank
        String senha,

        @NotNull
        Endereco endereco
) {
}
