package com.microservice.product.Model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "produto")
public class Product {
    public Product(){}
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome",nullable = false, length = 60)
    private String nomeProduto;
    @Column(name = "descricao",nullable = false, length = 100)
    private String descricao;
    @Column(name = "valor", precision = 10, scale = 2)
    private BigDecimal valor;

}
