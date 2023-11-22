package exceptions;

public class ExemploExceptions {
    public static void main(String[] args) {
//        semTratamentoException();
//        comTratamentoException();
//        comTratamentoExceptionComFinally();
      lancarRuntimeExeception();
        System.out.println("Teste");
    }

    private static void lancarRuntimeExeception() {
        try {
            String frase = null;
            String novaFrase = null;
            novaFrase = frase.toUpperCase();
        } catch (Exception e) {
            throw new RuntimeException("Parando o sistema");
        }
        System.out.println("Teste");
    }

    private static void comTratamentoException() {
        String frase = null;
        String novaFrase = null;
        try {
            novaFrase = frase.toUpperCase();
        } catch (NullPointerException e) {
            //Tratamento da execeção
            System.out.println("O frase inicial está nula, para solucionar tal o problema, foi lhe atribuido um valor default");
            frase = "Frase vazia";
            novaFrase = frase.toUpperCase();
        }
        System.out.println("Frase antiga: " + frase);
        System.out.println("Frase nova: " + novaFrase);
    }

    private static void comTratamentoExceptionComFinally() {
        String frase = null;
        String novaFrase = null;
        try {
            novaFrase = frase.toUpperCase();
        } catch (NullPointerException e) {
            //Tratamento da exceção
            System.out.println("O frase inicial está nula, para solucionar tal o problema, foi lhe atribuido um variavel");
            frase = "Frase vazia";
        } finally {
            novaFrase = frase.toUpperCase();
        }
        System.out.println("Frase antiga: " + frase);
        System.out.println("Frase nova: " + novaFrase);
    }

    private static void semTratamentoExcepetion() {
        String frase = null;
        String novaFrase = null;
        novaFrase = frase.toUpperCase();
        System.out.println("Frase antiga: " + frase);
        System.out.println("Frase nova: " + novaFrase);
    }
}
