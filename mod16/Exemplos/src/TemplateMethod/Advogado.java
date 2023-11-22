package TemplateMethod;

public class Advogado  extends Trabalhador{
    @Override
    protected void trabalhador() {

    }

    @Override
    public void executar() {
      System.out.println("Estou de férias");
    }

    @Override
    public void voltarPraCasa() {
        System.out.println("Voltar para casa de carro");
    }

    @Override
    public void irAoTrabalho() {
        super.irAoTrabalho();
    }

    @Override
    public void iniciarRotina() {
        super.iniciarRotina();
    }

    @Override
    public void levantar() {
        super.levantar();
    }
}
