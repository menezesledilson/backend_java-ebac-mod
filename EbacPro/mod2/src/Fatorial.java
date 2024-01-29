import java.math.BigInteger;

public class Fatorial {
    public static void main(String[] args) {

        int entrada1 = 3;
        BigInteger saida1 = calcularFatorial(entrada1);
        System.out.println("Entrada: " + entrada1 + "\nSaida: " + saida1);

        int entrada2 = 7;

        BigInteger saida2 = calcularFatorial(entrada2);
        System.out.println("Entrada: " + entrada2 + "\nSaida: " + saida2);
    }
    public static BigInteger calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(n).multiply(calcularFatorial(n - 1));
        }
    }
}