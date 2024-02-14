import java.util.ArrayList;
import java.util.List;

public class troco {

    public static List<Integer> darTroco(int quantia, int[] moedasDisponiveis) {
        List<Integer> troco = new ArrayList<>();
        int indexMoeda = 0;
        while (quantia > 0 && indexMoeda < moedasDisponiveis.length) {
            if (moedasDisponiveis[indexMoeda] <= quantia) {
                troco.add(moedasDisponiveis[indexMoeda]);
                quantia -= moedasDisponiveis[indexMoeda];
            } else {
                indexMoeda++;
            }
        }
        return troco;
    }

    public static void main(String[] args) {
        int quantia = 18;
        int[] moedasDisponiveis = {5, 2, 1};
        System.out.println("Entrada: Quantia " + quantia + ", Moedas disponíveis " + arrayToString(moedasDisponiveis));
        System.out.println("Saída: " + darTroco(quantia, moedasDisponiveis));
    }

    private static String arrayToString(int[] array) {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < array.length; i++) {
            builder.append(array[i]);
            if (i < array.length - 1) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }
}
