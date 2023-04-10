public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    // Node Class
    class Node {
        int value;
        Node next_node;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printLinkedList(){
        Node temp = this.head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next_node;
        }
    }

    public void append(int value){
        Node newNode = new Node(value);
        if (this.length == 0){
            this.head = newNode;
            this.tail = newNode;
        }
        else {
            this.tail.next_node = newNode;
            this.tail = newNode;
            newNode.next_node = null;
        }
        length++;
    }
}
