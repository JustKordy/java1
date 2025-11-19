public class Main {
    public static void main(String[] args) {
        // Vytvoření LinkedListu
        LinkedList list = new LinkedList();
        
        System.out.println("=== Test prázdného seznamu ===");
        list.printList();
        
        System.out.println("\n=== Test přidávání prvků na konec (add) ===");
        list.add(10);
        list.add(20);
        list.add(30);
        list.printList();
        
        System.out.println("\n=== Test přidávání prvků na začátek (addFirst) ===");
        list.addFirst(5);
        list.addFirst(1);
        list.printList();
        
        System.out.println("\n=== Test hledání prvků (contains) ===");
        System.out.println("Obsahuje 20? " + list.contains(20));
        System.out.println("Obsahuje 100? " + list.contains(100));
        System.out.println("Obsahuje 1? " + list.contains(1));
        System.out.println("Obsahuje 30? " + list.contains(30));
        
        System.out.println("\n=== Test mazání prvků (remove) ===");
        System.out.println("Mažu 20: " + list.remove(20));
        list.printList();
        
        System.out.println("\nMažu 1 (první prvek): " + list.remove(1));
        list.printList();
        
        System.out.println("\nMažu 30 (poslední prvek): " + list.remove(30));
        list.printList();
        
        System.out.println("\nMažu 100 (neexistující): " + list.remove(100));
        list.printList();
        
        System.out.println("\n=== Finální test - nový seznam ===");
        LinkedList list2 = new LinkedList();
        list2.add(100);
        list2.add(200);
        list2.add(300);
        list2.addFirst(50);
        list2.printList();
        System.out.println("Obsahuje 200? " + list2.contains(200));
        System.out.println("Mažu 200: " + list2.remove(200));
        list2.printList();
    }
}
