import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner txt = new Scanner(System.in);
        System.out.println("Opa, tudo bem? Me fala seu nome:");
        String nome = txt.nextLine();
        System.out.println("Show, " + nome + "! Bom ter você por aqui :D");
    }
}