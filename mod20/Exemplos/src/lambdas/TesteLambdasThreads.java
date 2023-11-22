package lambdas;

public class TesteLambdasThreads {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Teste");
            }
        };
        new Thread(r).start();

        Runnable rLambda = () -> System.out.println("Teste com função Lambda");
        new Thread(rLambda).start();

        new Thread(() -> System.out.println("Executar rLambda 1")).start();
    }
}
