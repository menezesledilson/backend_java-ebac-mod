package com.automovel.demo;

import com.automovel.demo.Model.Acessorio;
import com.automovel.demo.Model.Carro;
import com.automovel.demo.Model.Marca;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("AutomovelPU");
        EntityManager manager = factory.createEntityManager();

        EntityTransaction trx = manager.getTransaction();
        trx.begin();

        Carro carro = new Carro();
        carro.setNomeCarro("Uno");
        carro.setCor("prata");
        carro.setAno(2000);

        Marca marca = new Marca();
        marca.setNomeMarca("Fiat");

        Acessorio acessorio = new Acessorio();
        acessorio.setNomeAcessorio("Sistema de Som Premium, Protetor de Cár, Faróis de LED");

        marca.getCarros().add(carro);
        carro.getAcessorios().add(acessorio);

        manager.persist(carro);
        manager.persist(acessorio);
        trx.commit();
    }
}
