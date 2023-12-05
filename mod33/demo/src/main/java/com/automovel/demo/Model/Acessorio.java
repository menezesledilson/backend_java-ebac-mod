package com.automovel.demo.Model;


import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "acessorio")
public class Acessorio {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeAcessorio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeAcessorio() {
        return nomeAcessorio;
    }

    public void setNomeAcessorio(String nomeAcessorio) {
        this.nomeAcessorio = nomeAcessorio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Acessorio acessorio = (Acessorio) o;
        return Objects.equals(id, acessorio.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
