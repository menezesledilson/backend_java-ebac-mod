import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);
        System.out.println("Algoritmo de uma manhã de sábado qualquer:");
        System.out.println("1) Acordar");
        System.out.println("2) Levantar e ir ao banheiro tomar banho");
        System.out.println("3) Vai a praia? (responda com SIM ou NÃO)");
        String yesOrNot = resposta.nextLine().toUpperCase();
        if (yesOrNot.equals("SIM")) {
            System.out.println("4) Trocar roupa para: camiseta, bermuda e havaianas");
            System.out.println("5) Entrar no carro e fazer rota para praia");
        } else if (yesOrNot.equals("NÃO")){
            System.out.println("4) Trocar roupa para: bermuda");
            System.out.println("5) Dar um jeito na casa");
        } else {
            System.out.println("Resposta diferente de SIM/NÃO");
        }
    }
}