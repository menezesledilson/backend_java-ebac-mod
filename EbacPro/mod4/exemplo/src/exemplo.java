import java.util.ArrayList;
import java.util.List;

public class exemplo {

        public static List<List<Integer>> subconjuntosDeNElementos(List<Integer> S, int n) {
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> subset = new ArrayList<>();
            generateSubsets(S, n, 0, subset, result);
            return result;
        }

        private static void generateSubsets(List<Integer> S, int n, int index, List<Integer> subset, List<List<Integer>> result) {
            if (subset.size() == n) {
                result.add(new ArrayList<>(subset));
                return;
            }

            for (int i = index; i < S.size(); i++) {
                subset.add(S.get(i));
                generateSubsets(S, n, i + 1, subset, result);
                subset.remove(subset.size() - 1);
            }
        }

        public static void main(String[] args) {
            List<Integer> S1 = List.of(1, 2, 3);
            int n1 = 2;
            System.out.println("Entrada: " + S1 + ", n = " + n1);
            System.out.println("Saída: " + subconjuntosDeNElementos(S1, n1));

            List<Integer> S2 = List.of(1, 2, 3, 4);
            int n2 = 1;
            System.out.println("Entrada: " + S2 + ", n = " + n2);
            System.out.println("Saída: " + subconjuntosDeNElementos(S2, n2));
        }
    }

