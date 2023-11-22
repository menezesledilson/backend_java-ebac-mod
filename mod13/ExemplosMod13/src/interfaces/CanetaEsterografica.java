package interfaces;

public class CanetaEsterografica implements ICaneta {

    @Override
    public void escrever(String texto) {
        System.out.println("Escrevendo o valor " + texto + "na classse " + getClass().getSimpleName());
    }

    @Override
    public String getCor() {
return "Preto";
    }
}
