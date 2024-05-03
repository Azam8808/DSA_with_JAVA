public class LinkedList {
    class Node {
        int data;
        Node next;

        //constructor
        public  Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    
    public void addFirst(int data) {
        
        //step1 -> create new Node
        Node newNode = new Node(data);
                size++;

        if(head == null) {
            head = tail = newNode;
            return;
        }
        
        //step2 -> newNode.next = head
        newNode.next = head;
        //step3 -> head = newNode
        head = newNode;

    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
                size++;

        tail.next = newNode;
        tail = newNode;
    }
    public void addIdx(int idx, int data) {
        Node newNode = new Node(data);
                size++;

        Node temp = head;
    int i = 0;

     while(i < idx-1) {
        temp = temp.next;
        i++;
     }
     //i = idx-1; temp -> prev
     newNode.next = temp.next;
     temp.next = newNode;
    }
    public void print() {
        if(head ==  null) {
            System.out.print("");
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main (String args[]) {
        LinkedList ll = new LinkedList();
        // ll.print();
        ll.addFirst(2);
        // ll.print();
        ll.addFirst(1);
        // ll.print();
        ll.addLast(3);
        // ll.print();
        ll.addLast(4);
        ll.addIdx(2, 9);
        ll.print();
        System.out.println(ll.size);
    }
}