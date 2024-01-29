public class FatorialDinamic {

    public static void main(String[] args) {

        int entrada1 = 3;
        System.out.println("Entrada: " + entrada1 + "\nSaída: " + calcularFatorialBottomUp(entrada1));

        int entrada2 = 7;
        System.out.println("\nEntrada: " + entrada2 + "\nSaída: " + calcularFatorialBottomUp(entrada2));
    }
    public static  long calcularFatorialBottomUp(int n){
        if (n == 0 || n == 1){
            return 1;
        }

        long [] dp = new long[n + 1];
        dp[0] = 1;
        dp[1] =1;
        for (int i = 2; i <=n; i++ ){
            dp[i] = i * dp [i - 1];
        }
        return  dp[n];
    }
}
