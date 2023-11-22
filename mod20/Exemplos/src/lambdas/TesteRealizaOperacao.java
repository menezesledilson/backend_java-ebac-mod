package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

public class TesteRealizaOperacao {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        System.out.println("Multiplica todos os elementos da lista por 5:");
        realizarOperacao(list, (n) -> n * 5);

        System.out.println("Soma 3 em todos os elementos da lista ");
        realizarOperacao(list, (n) -> n + 3);

        System.out.println("Colocar 0 em todos os elementos da lista ");
        realizarOperacao(list, (n) -> 0 );

        realizarOperacao(list, new IntFunction<Integer>() {
            @Override
            public Integer apply(int value) {
                list.forEach( n -> {;
                n = n * 5;
                System.out.println(n + " ");
            });
                return  0;
        }
    });
}

    private static void realizarOperacao(List<Integer> list, IntFunction<Integer> function) {
        list.forEach(n -> {
            n = function.apply(n);
            System.out.println(n + " ");
        });
    }
}
