public class ComplexidadeCiclomatica {
    public static int fazerAlgumaCoisa(int a, int b, int c) {

        if (checarSeEhPar(a)) {

            return somarDoisNumeros(b,c);

        }
        if (checarSeEhPar(b)) {
            return somarDoisNumeros(a,c);
        }
        if (checarSeEhPar(c)) {
            return  somarDoisNumeros(a,b);

        }
        return -1;
    }

    public static boolean checarSeEhPar(int num) {

        return num % 2 == 0;
    }

    public static int somarDoisNumeros(int a, int b) {
        return a + b;
    }
}
