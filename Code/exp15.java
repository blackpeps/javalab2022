class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

class DoublyLinkedList {
    Node head;

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            System.out.println("Inserted " + data + " at the end of the list.");
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
        System.out.println("Inserted " + data + " at the end of the list.");
    }

    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }
        if (head.next == null) {
            head = null;
            System.out.println("Deleted the last element from the list.");
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        System.out.println("Deleted the last element from the list.");
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node current = head;
        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList dll = new DoublyLinkedList();
        while (true) {
            System.out.print("\n1. Insert\t2. Delete\t3. Display\t4. Exit\tChoice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element you want to insert:");
                    int element = scanner.nextInt();
                    dll.insertAtEnd(element);
                    break;
                case 2:
                    dll.deleteFromEnd();
                    break;
                case 3:
                    dll.printList();
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
} 
