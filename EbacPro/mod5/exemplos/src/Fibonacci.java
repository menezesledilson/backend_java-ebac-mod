public class Fibonacci {

        public static void main(String[] args) {
            int n = 10; // O número de elementos da sequência de Fibonacci que queremos gerar

            System.out.println("Sequência de Fibonacci até o " + n + "º termo:");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }

        public static int fibonacci(int n) {
            if (n <= 1) {
                return n;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }
    }

