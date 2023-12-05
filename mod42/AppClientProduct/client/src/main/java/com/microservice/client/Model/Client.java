package com.microservice.client.Model;


import jakarta.persistence.*;

import java.io.Serializable;

import lombok.*;

@Data
@AllArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "Cliente")

public class Client implements Serializable {
    private static final long serialVersionUID = 1L;

    public Client() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome", nullable = false,length = 60)
    private String nome;
    @Column(name = "cpf", nullable = false,length = 14)
    private String cpf;
    @Column(name = "email",nullable = false, length = 60)
    private String email;
    @Column(name = "Celular", nullable = false,length = 20)
    private String tel;
    @Column(name = "Logradouro",nullable = false, length = 60)
    private String logradouro;
    @Column(name = "Número", nullable = false,length = 3)
    private String numero;
    @Column(name = "Complemento", nullable = false,length = 60)
    private String complemento;
    @Column(name = "Cidade", nullable = false,length = 60)
    private String cidade;
    @Column(name = "UF", nullable = false,length = 2)
    private String uf;
    @Column(name = "CEP", nullable = false,length = 20)
    private String cep;

}

