package com.univesp.agendaservico.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="clientes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="cpf", nullable = false, unique = true)
    private String cpf;

    @Column(name="nome", nullable = false)
    private String nome;

    @Column(name="sobrenome", nullable = false)
    private String sobrenome;

    @Column(name="email", nullable = false, unique = true)
    private String email;

    @Column(name="senha", nullable = false)
    private String senha;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_image")
    private Image image;

    @OneToMany(mappedBy = "cliente")
    private List<Endereco> enderecos;
}
