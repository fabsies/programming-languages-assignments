public class Main {
    public static void main(String[] args) {

        // Linked List Demo
        LinkedList ll = new LinkedList();
        ll.insertFront(10);
        ll.insertFront(20);
        ll.insertFront(30);

        System.out.println("Linked List:");
        ll.printList();
        System.out.println("Size: " + ll.getSize());


        // Array Demo
        Array al = new Array();
        al.insertEnd(5);
        al.insertEnd(15);
        al.insertEnd(25);

        System.out.println("Array List:");
        al.printList();
        System.out.println("Size: " + al.getSize());
    }
}