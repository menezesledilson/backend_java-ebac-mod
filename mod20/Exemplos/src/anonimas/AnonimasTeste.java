package anonimas;

import lambdas.TesteLambdasThreads;

public class AnonimasTeste {
    public static void main(String[] args) {
        MyEventConsumer anonimas = new MyEventConsumer() {
            @Override
            public void consumer(Object value) {
                System.out.println(value);
            }
        };
        anonimas.consumer("Teste anonima");

        MyEventConsumer anonimaLambda = (Object value) -> System.out.println(value);
        anonimaLambda.consumer(10);

        receberInterface("Value " , value-> System.out.println(value));
        receberInterface(Boolean.TRUE , value-> System.out.println(value));
    }

    private static void receberInterface(Object o, MyEventConsumer anonimaLambda) {
        anonimaLambda.consumer(o);
    }

}
