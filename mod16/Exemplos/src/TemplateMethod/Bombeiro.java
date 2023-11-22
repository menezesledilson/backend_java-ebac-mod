package TemplateMethod;

 class Bombeiro extends Trabalhador{

    @Override
    protected void trabalhador() {
        System.out.println("Trabalhando como Bombeiro.");
    }
}
