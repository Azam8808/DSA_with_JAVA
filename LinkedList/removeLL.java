public class removeLL {
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
            size++;
            if (head == null) {
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
    
        public void addLast(int data) {
            if (tail == null) {
                System.out.println("ll is empty");
                return;
            }
            Node newNode = new Node(data);
            size++;
            tail.next = newNode;
            tail = newNode;
        }
    
        public int removeFirst() {
            if (size == 0) {
                System.out.println("ll is empty");
                return Integer.MIN_VALUE;
            } else if (size == 1) {
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }
        public int removeLast() {
            if(size == 0) {
                System.out.println("ll is empty");
                return Integer.MIN_VALUE;
            }else if (size == 1) {
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
            Node prev = head;
            for(int i=0; i<size-2; i++) {
                prev = prev.next;
            }
            int val = prev.next.data;
            tail = prev;
            size--;
            return val;
        }
    
        public void print() {
            if (head == null) {
                System.out.println("ll is empty");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    
        public static void main(String args[]) {
            removeLL ll = new removeLL();
            ll.addFirst(2);
            ll.addFirst(1);
            ll.addLast(3);
            ll.addLast(4);
            ll.addLast(5);
            ll.print();
            ll.removeFirst();
            ll.print();
            ll.removeLast();
            System.out.println(size);
            ll.print();
            
        }
    }
