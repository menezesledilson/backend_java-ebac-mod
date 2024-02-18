public class Calculadora {


        private int adicionar(int a, int b) {
            return a + b;
        }

        private int subtrair(int a, int b) {
            return a - b;
        }

        private int multiplicar(int a, int b) {
            return a * b;
        }

        private int dividir(int a, int b) {
            if (b == 0) {
                throw new IllegalArgumentException("Divisão por zero não é permitida.");
            }
            return a / b;
        }

        // Testes unitários

        public static void main(String[] args) {
            Calculadora calculadora = new Calculadora();
            testarAdicionar(calculadora);
            testarSubtrair(calculadora);
            testarMultiplicar(calculadora);
            testarDividir(calculadora);
        }

        private static void testarAdicionar(Calculadora calculadora) {
            int resultado = calculadora.adicionar(5, 3);
            assert resultado == 8 : "Teste de adição falhou";
            System.out.println("Teste de adição passou.");
        }

        private static void testarSubtrair(Calculadora calculadora) {
            int resultado = calculadora.subtrair(5, 3);
            assert resultado == 2 : "Teste de subtração falhou";
            System.out.println("Teste de subtração passou.");
        }

        private static void testarMultiplicar(Calculadora calculadora) {
            int resultado = calculadora.multiplicar(5, 3);
            assert resultado == 15 : "Teste de multiplicação falhou";
            System.out.println("Teste de multiplicação passou.");
        }

        private static void testarDividir(Calculadora calculadora) {
            int resultado = calculadora.dividir(6, 3);
            assert resultado == 2 : "Teste de divisão falhou";

            // Testar divisão por zero
            try {
                calculadora.dividir(6, 0);
                System.out.println("Teste de divisão por zero falhou: não lançou exceção.");
            } catch (IllegalArgumentException e) {
                System.out.println("Teste de divisão por zero passou.");
            }
        }
    }
/*
/**
 * A classe Calculadora realiza operações aritméticas simples como adição, subtração,
 * multiplicação e divisão.

   public class Calculadora {

    /**
     * Realiza a adição de dois números inteiros.
     *
     * @param a O primeiro número a ser somado.
     * @param b O segundo número a ser somado.
     * @return A soma dos dois números.

    private int adicionar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a subtração de dois números inteiros.
     *
     * @param a O número do qual será subtraído o segundo número.
     * @param b O número a ser subtraído do primeiro número.
     * @return O resultado da subtração.

   // private int subtrair(int a, int b) {
        return a - b;
    }


     * Realiza a multiplicação de dois números inteiros.
     *
     * @param a O primeiro número a ser multiplicado.
     * @param b O segundo número a ser multiplicado.
     * @return O resultado da multiplicação.

    private int multiplicar(int a, int b) {
        return a * b;
    }


     * Realiza a divisão de dois números inteiros.
     *
     * @param a O dividendo.
     * @param b O divisor.
     * @return O resultado da divisão.
     * @throws IllegalArgumentException Se o divisor for zero.

    private int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    // Testes unitários

    /**
     * Executa todos os testes unitários para a classe Calculadora.
     *
     * @param args Os argumentos da linha de comando (não utilizados).

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        testarAdicionar(calculadora);
        testarSubtrair(calculadora);
        testarMultiplicar(calculadora);
        testarDividir(calculadora);
    }

    /**
     * Testa o método de adição da Calculadora.
     *
     * @param calculadora A instância da calculadora a ser testada.

    private static void testarAdicionar(Calculadora calculadora) {
        int resultado = calculadora.adicionar(5, 3);
        assert resultado == 8 : "Teste de adição falhou";
        System.out.println("Teste de adição passou.");
    }

    /**
     * Testa o método de subtração da Calculadora.
     *
     * @param calculadora A instância da calculadora a ser testada.

    private static void testarSubtrair(Calculadora calculadora) {
        int resultado = calculadora.subtrair(5, 3);
        assert resultado == 2 : "Teste de subtração falhou";
        System.out.println("Teste de subtração passou.");
    }

    /**
     * Testa o método de multiplicação da Calculadora.
     *
     * @param calculadora A instância da calculadora a ser testada.

    private static void testarMultiplicar(Calculadora calculadora) {
        int resultado = calculadora.multiplicar(5, 3);
        assert resultado == 15 : "Teste de multiplicação falhou";
        System.out.println("Teste de multiplicação passou.");
    }

    /**
     * Testa o método de divisão da Calculadora, incluindo a divisão por zero.
     *
     * @param calculadora A instância da calculadora a ser testada.
     
    private static void testarDividir(Calculadora calculadora) {
        int resultado = calculadora.dividir(6, 3);
        assert resultado == 2 : "Teste de divisão falhou";

        // Testar divisão por zero
        try {
            calculadora.dividir(6, 0);
            System.out.println("Teste de divisão por zero falhou: não lançou exceção.");
        } catch (IllegalArgumentException e) {
            System.out.println("Teste de divisão por zero passou.");
        }
    }
}
*/