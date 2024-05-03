public class deleteNthFromEnd {
        public class Node {
            int data;
            Node next;
    
            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
    
        public static Node head;
        public static Node tail;
        public static int size;
    
        public void addFirst(int data) {
            Node newNode = new Node(data);
           
            if (head == null) {
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
    
        }
    
        public void addLast(int data) {
            
            Node newNode = new Node(data);
         
            if (tail == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
    
        public void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
        public void deleteNthFromEnd(int n) {
            int sz = 0;
            //calculate size
            Node temp = head;
            while(temp != null) {
                temp = temp.next;
                sz++;
            }
            if(n == sz) {
                head = head.next;//remove first
                return;
            }
            //sz-n
            int i=1;
            int iToFind = sz-n;
            Node prev = head;
            while(i < iToFind) {
                prev = prev.next;
                i++;
            }
            prev.next = prev.next.next;
            return;
        }
    
        public static void main(String args[]) {
            reverseLL ll = new reverseLL();
            ll.addFirst(2);
            ll.addFirst(1);
            ll.addLast(3);
            ll.addLast(4);
            ll.print();
           
        }
    
    
}
