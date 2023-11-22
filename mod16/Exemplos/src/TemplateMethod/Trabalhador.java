package TemplateMethod;

public abstract class Trabalhador {

    public void executar() {
        iniciarRotina();
        levantar();
        irAoTrabalho();
        trabalhador();
        voltarPraCasa();
    }

    protected abstract void trabalhador();

    public void voltarPraCasa() {
        System.out.println("Voltando para casa.");
    }

    public void irAoTrabalho() {
        System.out.println("Indo Trabalhar");
    }

    public void iniciarRotina() {
        System.out.println("-----------------------");
        System.out.println("Iniciando Rotina");
    }
    public void levantar() {
        System.out.println("Levantar");
     }
    }

