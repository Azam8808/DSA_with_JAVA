public class searchLL {
    public class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            Node next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(tail == null) {
            head = tail = newNode;
            return;
        }
            tail.next = newNode;
            tail = newNode;
        
    }
    public void print() {
        Node temp = head;
        while(temp != null) {
             System.out.print(temp.data+"->");
            temp = temp.next;
           
        }
        System.out.println("null");

    }
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while(temp != null) {
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public static void main(String args[]) {
        searchLL ll = new searchLL();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
        ll.itrSearch(3);
    }
    
}
