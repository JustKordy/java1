public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    // Přidá hodnotu na konec seznamu
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Přidá hodnotu na začátek seznamu
    public void addFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    // Smaže první výskyt hodnoty
    public boolean remove(int value) {
        if (head == null) {
            return false;
        }
        
        // Pokud je hodnota v hlavě
        if (head.data == value) {
            head = head.next;
            return true;
        }
        
        Node current = head;
        while (current.next != null) {
            if (current.next.data == value) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Testuje přítomnost hodnoty
    public boolean contains(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Vypíše všechny prvky seznamu
    public void printList() {
        if (head == null) {
            System.out.println("Seznam je prázdný");
            return;
        }
        
        Node current = head;
        System.out.print("Seznam: ");
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}
