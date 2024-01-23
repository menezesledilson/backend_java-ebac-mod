class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ListaEncadeada {
    private Node head;

    // Adiciona o nó ao fim da lista
    public void push(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    // Remove o nó no fim da lista e retorna o mesmo
    public Node pop() {
        if (head == null) {
            return null;
        } else if (head.next == null) {
            Node temp = head;
            head = null;
            return temp;
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            Node temp = current.next;
            current.next = null;
            return temp;
        }
    }

    // Adiciona um nó na posição da lista indicada via parâmetro
    public void insert(int index, Node node) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Índice negativo não permitido");
        }

        if (index == 0) {
            node.next = head;
            head = node;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                if (current == null) {
                    throw new IndexOutOfBoundsException("Índice fora do limite");
                }
                current = current.next;
            }
            if (current == null) {
                throw new IndexOutOfBoundsException("Índice fora do limite");
            }
            node.next = current.next;
            current.next = node;
        }
    }

    // Remove um nó na posição da lista indicada via parâmetro
    public void remove(int index) {
        if (index < 0 || head == null) {
            return;
        }

        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                if (current == null || current.next == null) {
                    return;
                }
                current = current.next;
            }
            if (current.next != null) {
                current.next = current.next.next;
            }
        }
    }

    // Retorna o elemento que está no índice da lista indicado via parâmetro
    public Node elementAt(int index) {
        if (index < 0 || head == null) {
            return null;
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            if (current == null) {
                return null;
            }
            current = current.next;
        }

        return current;
    }

    // Retorna o tamanho da lista
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Retorna uma representação em texto da lista
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        lista.push(new Node(1));
        lista.push(new Node(2));
        lista.push(new Node(3));

        lista.printList();

        System.out.println("Tamanho da lista: " + lista.size());

        Node removedNode = lista.pop();
        System.out.println("Nó removido do fim da lista: " + removedNode.data);

        lista.printList();

        lista.insert(1, new Node(4));
        lista.printList();

        lista.remove(1);
        lista.printList();
    }
}
