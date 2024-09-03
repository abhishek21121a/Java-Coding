import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private Node top;

    Stack() {
        this.top = null;
    }

    public void push(int item) {
        Node newNode = new Node(item);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        System.out.println("Dress added: " + item);
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int item = top.data;
        top = top.next;
        return item;
    }

    public void display() {
        if (top == null) {
            System.out.println("Wardrobe is Empty");
            return;
        }
        Node temp = top;
        System.out.println("Dresses in the Wardrobe:");
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}

public class main {
    public static void main(String[] args) {
        Stack s = new Stack();
        Scanner sc = new Scanner(System.in);
        int option, item;

        while (true) {
            System.out.println("1. Add Dress");
            System.out.println("2. Remove Dress");
            System.out.println("3. Display Dresses");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter Dress Number: ");
                    item = sc.nextInt();
                    s.push(item);
                    break;
                case 2:
                    item = s.pop();
                    if (item != -1)
                        System.out.println("Removed Dress: " + item);
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
}
