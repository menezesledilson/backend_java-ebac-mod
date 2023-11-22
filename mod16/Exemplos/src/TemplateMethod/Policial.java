package TemplateMethod;

public class Policial extends Trabalhador {
    @Override
    protected void trabalhador() {
        System.out.println("Trabalhando como Policial. ");
    }

    @Override
    public void levantar() {
        super.levantar( );
        System.out.println("Levantar as 08:00 ");
    }
}
