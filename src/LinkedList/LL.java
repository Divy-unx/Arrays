package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    private static class Node{
        private int value;
        private Node next;

        public Node(){

        }

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int val){
        if (tail == null){
            tail = head;
        }

        Node node = new Node();
        node.next = head;
        head = node;
        size++;
    }

    static void main() {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(4);
    }




}
