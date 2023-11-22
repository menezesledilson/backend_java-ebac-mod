package stream;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*Transformar uma lista de um pra outra*/
public class ExemploMap {

    public static void main(String[] args) {

        List<Pessoa> lista = new Pessoa().populaPessoa();

        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .map(Pessoa::getIdade);

        IntStream stream1 =lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .mapToInt(Pessoa::getIdade);
    }
}
