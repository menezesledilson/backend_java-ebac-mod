import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class FilaInteiros {
    private Queue<Integer> fila;

    //Construtor da classe
    public FilaInteiros() {
        fila = new LinkedList<>();
    }

    //Adiciona um inteiro à fila
    public void enqueue(int elemento) {
        fila.offer(elemento);
    }

    //Remove um inteiro da fila
    public int dequeue() throws NoSuchFieldException {
        if (isEmpty()) {
            throw new NoSuchFieldException("A fila está vazia");
        }
        return fila.poll();
    }
    //Retorna o inteiro que está no fim da fila
    public int rear() throws NoSuchFieldException {
        if (isEmpty()) {
            throw new NoSuchFieldException("A fila está vazia");
        }
        return ((LinkedList<Integer>) fila).getLast();
    }

    // Retorna o inteiro que está na frente da fila
    public int front() {
        if (isEmpty()) {
            throw new NoSuchElementException("A fila está vazia");
        }
        return fila.peek();
    }

    // Retorna o tamanho da fila
    public int size() {
        return fila.size();
    }

    // Retorna true se a fila está vazia, false caso contrário
    public boolean isEmpty() {
        return fila.isEmpty();
    }

    public static void main(String[] args) throws NoSuchFieldException {
        FilaInteiros fila = new FilaInteiros();

        System.out.println("A fila está vazia? " + fila.isEmpty());

        fila.enqueue(5);
        fila.enqueue(10);
        fila.enqueue(15);

        System.out.println("Tamanho da fila: " + fila.size());
        System.out.println("Elemento na frente: " + fila.front());
        System.out.println("Elemento no fim: " + fila.rear());

        fila.dequeue();
        System.out.println("Elemento removido. Tamanho da fila agora: " + fila.size());
        System.out.println("Elemento na frente agora: " + fila.front());
        System.out.println("Elemento no fim agora: " + fila.rear());

        System.out.println("A fila está vazia? " + fila.isEmpty());

    }
}
