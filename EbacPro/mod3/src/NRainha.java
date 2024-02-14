public class NRainha {
    private static boolean teamAtaque(int x, int y, int[][] tab) {
        //checando linhas e colunas
        for (int j = 0; j < tab.length; j++) {
            if (tab[x][j] == 1) {
                return true;
            }
        }
        for (int i = 0; i < tab.length; i++) {
            if (tab[i][y] == 1) {
                return true;
            }
        }
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                int indEsq = 1 + j;
                int indDir = 1 - j;

                if (indEsq == (x + y)) {
                    if (tab[i][j] == 1) {
                        return true;
                    }
                }
                if (indDir == (x - y)) {
                    if (tab[i][j] == 1) {
                        return true;
                    }

                }
            }
        }
        //Checando as diagonais
        return false;
    }

    private  static  void imprimeTabuleiro(int [][]tab){
        for (int i = 0; i < tab.length; i++){
            for (int j = 0; j < tab.length; j++){
                System.out.print(tab[i][j]);
            }
            System.out.println();
        }

    }

    private static boolean resolveNRainhas(int[][] tab, int n) {

        //Checa se todas as rainhas foram colocadas
        if (n == 0) {
            return true;
        }
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                if (teamAtaque(i, j, tab)) {
                    continue;

                }
                //colocar a rainha no tabuleiro
                tab[i][j] = 1;
                if (resolveNRainhas(tab, n - 1)) {
                    return true;
                }
                //solução não foi encontrada, desfazendo a última mundança
                tab[i][j] = 0;
            }

        }
        return false;
    }
    public static void main(String [] args){
        int[][] tab = {
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0},

        };
        int n = 4;
        boolean resultado = resolveNRainhas(tab, n);
        if(resultado){
            imprimeTabuleiro(tab);
        }else{
           System.out.print("Não conssegui encontrar uma solução");
        }
    }
}
