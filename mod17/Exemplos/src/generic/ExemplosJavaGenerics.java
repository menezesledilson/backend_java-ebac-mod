//package generic;
//
//import generic.fruta.Banana;
//import generic.fruta.Maca;
//import generic.fruta.Fruta;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ExemplosJavaGenerics {
//
//    public static void main(String[] args) {
//
//        List<String> lista = new ArrayList();
//        lista.add("Rodrigo");
//        lista.add("1");
//        imprimir(lista);
//
//        List<Long> listaLong = new ArrayList();
//        listaLong.add(1L);
//        listaLong.add(2L);
//        imprimir(listaLong);
//
//        String primeiroSt = pegarPrimeiraLista(lista);
//        System.out.println(primeiroSt);
//
////        Long primeiroLong = pegarPrimeiraLista(listaLong);
////        System.out.println(primeiroLong);
//
////        Long primeiroLong2 = pegarPrimeiraListaLong(lista);
////        System.out.println(primeiroLong2);
//
//        imprimir2(listaLong);
//
//        List<Fruta>frutas = new ArrayList<>();
//        frutas.add(new Maca());
//        frutas.add(new Banana());
//        imprimirfruta(frutas);
//    }
//    public  static  void imprimir2(List<?> lista){
//        for (Object st : lista){
//            if( st instanceof  Long){
//                Long stLong = (Long) st;
//                System.out.println( stLong);
//            }
//            System.out.println("Qualquer coisa: " + st);
//        }
//    }
//
//    public  static  void imprimirfruta(List<? extends Fruta> lista){
//
//       for (Fruta fruta : lista){
//           System.out.println(fruta);
//       }
//    }
//    public static <T> void imprimir(List<T> lista) {
//        for (T st : lista) {
//            System.out.println(st);
//        }
//    }
//
//
//    public static <T> T pegarPrimeiraLista(List<T> lista) {
//        return lista.get(0);
//    }
//
//    public static <T> Long pegarPrimeiraListaLong(List<T> lista) {
//        return (Long) lista.get(0);
//    }
//}
//
