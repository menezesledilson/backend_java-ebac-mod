import java.util.ArrayList;
import java.util.EmptyStackException;

public class PilhaInteiros {
    private ArrayList<Integer> pilha;

    // Construtor da classe
    public PilhaInteiros() {
        pilha = new ArrayList<>();
    }

    // Coloca um inteiro no topo da pilha
    public void push(int elemento) {
        pilha.add(elemento);
    }

    // Remove o valor do topo da pilha e o retorna ao chamador
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int topo = pilha.remove(pilha.size() - 1);
        return topo;
    }

    // Espia o inteiro que está no topo e o retorna sem mexer na pilha
    public int top() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return pilha.get(pilha.size() - 1);
    }

    // Retorna true se a pilha está vazia, false caso contrário
    public boolean isEmpty() {
        return pilha.isEmpty();
    }

    // Retorna o número de elementos na pilha
    public int size() {
        return pilha.size();
    }

    public static void main(String[] args) {
        PilhaInteiros pilha = new PilhaInteiros();

        System.out.println("A pilha está vazia? " + pilha.isEmpty());

        pilha.push(5);
        pilha.push(10);
        pilha.push(15);

        System.out.println("Tamanho da pilha: " + pilha.size());
        System.out.println("Elemento no topo: " + pilha.top());

        pilha.pop();
        System.out.println("Elemento removido. Tamanho da pilha agora: " + pilha.size());
        System.out.println("Elemento no topo agora: " + pilha.top());

        System.out.println("A pilha está vazia? " + pilha.isEmpty());
    }
}
