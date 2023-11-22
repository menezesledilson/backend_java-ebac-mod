import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Wrappers num = new Wrappers();
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        Integer numero1 = s.nextInt();

        System.out.println("Digite o segundo valor: ");
        Long numero2 = s.nextLong();

        num.convertInteger(numero1);
        num.convertLong(numero2);

    }
}