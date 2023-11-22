import interfaces.*;

public class ClasseTeste {

    public static void main(String args[]) {
//
//        ICaneta caneta = new CanetaEsterografica();
//        caneta.escrever("Olá Ledilson ");
//        caneta.escreverComumATodas();
//        System.out.println(caneta.getCor());
//
//        ICaneta Giz = new Giz();
//        Giz.escrever("Olá Ledilson ");
//        caneta.escreverComumATodas();
//        System.out.println(Giz.getCor());
//
//        ICaneta Lapis = new Lapis();
//        Lapis.escrever("Olá Ledilson ");
//        caneta.escreverComumATodas();
//        System.out.println(Lapis.getCor());

        ICarro carro = new CarroPasseio();
        carro.andar();
        carro.parar();

       ICarro caminhao = new Caminhao();
       caminhao.andar();
       caminhao.parar();
    }
}
