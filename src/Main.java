public class Main {
    public static void main(String[] args) {

        System.out.println("=== CREANDO LISTA ===");
        DoubleLinkedList dll = new DoubleLinkedList(10);
        dll.getHead();
        dll.getTail();
        dll.getLength();
        System.out.println("Lista actual:");
        dll.printList();
        System.out.println();

        // ---------- APPEND ----------
        System.out.println("=== APPEND ===");
        dll.append(20);
        dll.append(30);
        dll.append(40);
        System.out.println("Después de append(20, 30, 40):");
        dll.printList();
        dll.getHead();
        dll.getTail();
        dll.getLength();
        System.out.println();

        // ---------- PREPEND ----------
        System.out.println("=== PREPEND ===");
        dll.prepend(5);
        dll.prepend(1);
        System.out.println("Después de prepend(5, 1):");
        dll.printList();
        dll.getHead();
        dll.getTail();
        dll.getLength();
        System.out.println();

        // ---------- PRINT LIST REVERSE ----------
        System.out.println("=== PRINT LIST REVERSE ===");
        System.out.println("Lista en orden inverso:");
        dll.printListReverse();
        System.out.println();

        // ---------- GET (lookup by index) ----------
        System.out.println("=== GET (lookup by index) ===");
        System.out.println("get(0): " + (dll.get(0) != null ? dll.get(0).value : "null"));
        System.out.println("get(2): " + (dll.get(2) != null ? dll.get(2).value : "null"));
        System.out.println("get(4): " + (dll.get(4) != null ? dll.get(4).value : "null"));
        System.out.println("get(10): " + (dll.get(10) != null ? dll.get(10).value : "null"));
        System.out.println();

        // ---------- FIND (lookup by value) ----------
        System.out.println("=== FIND (lookup by value) ===");
        DoubleLinkedList.Node found1 = dll.find(30);
        System.out.println("find(30): " + (found1 != null ? found1.value : "No encontrado"));

        DoubleLinkedList.Node found2 = dll.find(99);
        System.out.println("find(99): " + (found2 != null ? found2.value : "No encontrado"));

        DoubleLinkedList.Node found3 = dll.find(1);
        System.out.println("find(1): " + (found3 != null ? found3.value : "No encontrado"));
        System.out.println();

        // ---------- INSERT ----------
        System.out.println("=== INSERT ===");
        dll.insert(0, 0);      // al inicio
        dll.insert(3, 15);     // en medio
        dll.insert(7, 50);     // al final (en este momento la lista tiene 7 elementos)
        System.out.println("Después de insert(0,0), insert(3,15), insert(7,50):");
        dll.printList();
        dll.getHead();
        dll.getTail();
        dll.getLength();
        System.out.println();

        // ---------- REMOVE (by index) ----------
        System.out.println("=== REMOVE (by index) ===");
        System.out.println("Lista antes de remove:");
        dll.printList();

        DoubleLinkedList.Node removed1 = dll.remove(0);   // quita el primero
        System.out.println("remove(0) → " + (removed1 != null ? removed1.value : "null"));

        DoubleLinkedList.Node removed2 = dll.remove(2);   // quita del medio
        System.out.println("remove(2) → " + (removed2 != null ? removed2.value : "null"));

        DoubleLinkedList.Node removed3 = dll.remove(5);   // quita el último (índice 5 después de las eliminaciones anteriores)
        System.out.println("remove(5) → " + (removed3 != null ? removed3.value : "null"));

        System.out.println("Lista después de removes:");
        dll.printList();
        dll.getHead();
        dll.getTail();
        dll.getLength();
        System.out.println();

        // ---------- REMOVE FIRST / REMOVE LAST ----------
        System.out.println("=== REMOVE FIRST / REMOVE LAST ===");
        DoubleLinkedList.Node first = dll.removeFirst();
        System.out.println("removeFirst() → " + (first != null ? first.value : "null"));

        DoubleLinkedList.Node last = dll.removeLast();
        System.out.println("removeLast() → " + (last != null ? last.value : "null"));

        System.out.println("Lista final:");
        dll.printList();
        dll.getHead();
        dll.getTail();
        dll.getLength();
    }
}