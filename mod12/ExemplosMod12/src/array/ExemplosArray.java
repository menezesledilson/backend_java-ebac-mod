package array;

public class ExemplosArray {

    public static void main(String[] args) {
        novoArray();
        arrayBidimensional();
        percorrendoArray1();
        percorrendoArray2();
        tamanhoArray();
        declaracaoArray();

    }
    private static void  novoArray(){
        System.out.println("* novoArray *");
        String[] nomes = new String[4];
        nomes [0] = "Rodrigo";
        nomes [1] = "Alê";
        nomes [2] = "Rodrigo";
        nomes [3] = "Maria";

        for (String nome : nomes){
            System.out.println(nome);
        }
    }
    private  static  void arrayBidimensional(){
        System.out.println("** arrayBidimensional**");
        int [] [] array1 = {{1, 2, 3},{4, 5, 6}};
        int [] [] array2 = {{1, 2, },{3},{4, 5, 6}};
        System.out.println("Valores no array1 passados na linha são");
        outpuArray (array1);//exibe o array 2 por linha

        System.out.println("Valores do array2 passados na linha são:");
        outpuArray(array2); //exibe o array 2 por linha
    }
    public static  void outpuArray (int [] [] array){
        //Faz um loop pelas linhas do array

        for (int linha = 0; linha < array.length; linha++){
            // FAZ LOOP PELAS COLUNAS DA LINHA ATUAL
            for (int coluna =0; coluna <array[linha].length; coluna++){
                System.out.printf("%d",array[linha][coluna]);
            }
            System.out.println();
        }
    }

    private  static  void percorrendoArray2() {
        System.out.println("*percorrendoArray2*");
        int[] arrayNum = {87, 68, 52, 5, 49, 83, 45, 12, 64};
        int total = 0;
        for (int i = 0; i < arrayNum.length; i++){
            System.out.println(arrayNum[i]);
        }
     }
    private  static  void percorrendoArray1() {
        System.out.println("*percorrendoArray1*");
        int [] arrayNum = {87, 68, 5, 49, 83, 45, 12, 64};
        int total = 0;
        //Adcionar o valor de cada elemento ao total
    for (int i : arrayNum){
        total += i;
    }
    System.out.println("1 - Total de elementos arrayNum: " + total);
    }

    private  static  void tamanhoArray(){
        System.out.println("* TamanhoArray *");
        int[] arrayUm = {12,3,5,68,9,6,73,44,456,65,321};
        int[] arrayDois = {43,42,4,8,55,21,2,45};

        if (arrayDois.length > 8 ){
            System.out.println("Tamanho do ArrayDois - Maior que 8 !");
        }else{
            System.out.println("Tamanho do Arrayois - Menor que 8 !");
        }
        System.out.println("\n Tamanho do ArrayUm = "+arrayUm.length);
    }

    private static  void declaracaoArray(){
        System.out.println("* declaracaoArray *");

        int[] meuArray; // Adiciona a declaração da variável como um array de inteiros

        //[] - são inseridos em uma variável que referencia uma array
        int[] a = new int[4];

        //Outra maneira de fazer uma declração de array
        int[] b;
       b = new int[10];

        //Declarando vários arrays
        int[] r = new int[44], k = new int[23];

        //{} - inicializar valores em um array sua declaração
        int[] iniciaValores = {12,32,54,6,8,89,64,64,6};

        //Declara um array de inteiros
        meuArray = new int [10];

        //INICIALIZA O PRIMEIRO ELEMENTO
        meuArray [0] = 100;
        meuArray [1] = 85;
        meuArray [2] = 88;
        meuArray [3] = 93;
        meuArray [4] = 123;
        meuArray [5] = 952;
        meuArray [6] = 344;
        meuArray [7] = 233;
        meuArray [8] = 622;
        meuArray [9] = 8522;
        //meuArray [10] = 564; //ESTOURA A PILHA POIS NÃO EXISTE O ÍNDICE 10

        System.out.println(meuArray[9]);
        System.out.println(meuArray[2]);

    }

}
