class LL {
    private Node head;
    private Node tail;

    void display() {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("end");
    }

    public void inserAtfirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }

    }

    public void inserAtend(int val) {
        Node node = new Node(val);
        if (head == null) {
            inserAtfirst(val);
        }
        tail.next = node;
        tail = node;
    }

    private class Node {
        private int val;
        private Node next;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

}

public class linked {

    public static void main(String[] args) {
        LL list = new LL();
        list.inserAtfirst(56);
        list.inserAtfirst(1);
        list.inserAtfirst(4);
        list.inserAtfirst(3);
        list.inserAtfirst(6);
        list.inserAtend(23);
        list.display();

    }
}