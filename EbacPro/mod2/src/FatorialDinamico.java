import java.util.HashMap;
import java.util.Map;

public class FatorialDinamico {

    public static void main(String[] args) {
        int entrada1 = 3;
        System.out.println("Entrada: " + entrada1 + "\nSaida: " + calcularFatorialTopDown(entrada1));

        int entrada2 = 7;
        System.out.println("Entrada: " + entrada2 + "\nSaida: " + calcularFatorialTopDown(entrada2));
    }
    public static long calcularFatorialTopDown(int n) {
        Map<Integer, Long> memo = new HashMap<>();
        return calcularFatorialTopDownRecursivo(n, memo);
    }
    private static long calcularFatorialTopDownRecursivo(int n, Map<Integer, Long> memo) {
        if (n == 0 || n == 1) {
            return 1;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        long resultado = n * calcularFatorialTopDownRecursivo(n - 1, memo);
        memo.put(n, resultado);
        return resultado;
    }
}
