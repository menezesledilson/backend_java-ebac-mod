package ExemplosSingleton;

public class DemoSingletonPropriedade {

    public static void main(String args[]) {

        SingletonPropriedade singleton = SingletonPropriedade.getInstance("teste");
        SingletonPropriedade singleton1 = SingletonPropriedade.getInstance("teste1");

        System.out.println(singleton.getValue());
        System.out.println(singleton1.getValue());
    }
}
