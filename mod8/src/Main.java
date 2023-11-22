import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Float n1, n2, n3, n4;
        Calculadora media = new Calculadora();
        Scanner num = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        n1 = num.nextFloat();
        System.out.println("Digite o segundo número: ");
        n2 = num.nextFloat();
        System.out.println("Digite o terceiro número: ");
        n3 = num.nextFloat();
        System.out.println("Digite o quarto número: ");
        n4 = num.nextFloat();
        media.mediaAritmetica(n1,n2,n3,n4);
    }
}