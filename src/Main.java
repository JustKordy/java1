public class Main {
    public static void main(String[] args) {
        // Vytvoření LinkedListu
        LinkedList list = new LinkedList();

        System.out.println("=== Test LinkedListu ===\n");

        // Test prázdného seznamu
        System.out.println("1. Prázdný seznam:");
        list.printList();
        System.out.println();

        // Přidání prvků na konec
        System.out.println("2. Přidání prvků na konec (add):");
        list.add(10);
        list.add(20);
        list.add(30);
        list.printList();
        System.out.println();

        // Přidání prvku na začátek
        System.out.println("3. Přidání prvku na začátek (addFirst):");
        list.addFirst(5);
        list.printList();
        System.out.println();

        // Test obsahuje
        System.out.println("4. Test přítomnosti (contains):");
        System.out.println("Obsahuje 20? " + list.contains(20));
        System.out.println("Obsahuje 50? " + list.contains(50));
        System.out.println();

        // Přidání více prvků
        System.out.println("5. Přidání více prvků:");
        list.add(40);
        list.addFirst(1);
        list.printList();
        System.out.println();

        // Test mazání
        System.out.println("6. Test mazání (remove):");
        System.out.println("Smazání prvku 20: " + list.remove(20));
        list.printList();
        System.out.println();

        System.out.println("7. Smazání prvku na začátku (1):");
        System.out.println("Smazání prvku 1: " + list.remove(1));
        list.printList();
        System.out.println();

        System.out.println("8. Smazání prvku na konci (40):");
        System.out.println("Smazání prvku 40: " + list.remove(40));
        list.printList();
        System.out.println();

        System.out.println("9. Pokus o smazání neexistujícího prvku (100):");
        System.out.println("Smazání prvku 100: " + list.remove(100));
        list.printList();
        System.out.println();

        // Finální test
        System.out.println("10. Kontrola finálního stavu:");
        System.out.println("Obsahuje 5? " + list.contains(5));
        System.out.println("Obsahuje 10? " + list.contains(10));
        System.out.println("Obsahuje 30? " + list.contains(30));
        System.out.println("Obsahuje 20? " + list.contains(20));
        list.printList();
    }
}
