
class LinkedSearch {
    public static class Node {
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
        if(head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
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
    public void print() {
        if(head == null) {
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public int removeFirst() {
        if(size == 0) {
            System.out.println("ll is empty");
        }else if(size == 1) {
            int val = head.data;
            head = tail = null;
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
        }else if(size == 1) {
            int val = tail.data;
            head = tail = null;
            return val;
        }
        Node prev = head;
        for(int i=0; i<size-2; i++){
          prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }
    public int itrSearch(int key) {
         Node temp = head;
         int i = 0;
         while(temp != null) {
            if(temp.data == key) { // key is found
                return i;
            }
            temp = temp.next;
            i++;
         }
         // Key is not Found
         return -1;
    }
    public void reverse() {
       Node prev = null;
       Node curr = tail = head;
       Node next;
       while(curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
       }
       head = prev;
    }
    public static void main (String args[]) {
        LinkedSearch ll = new LinkedSearch();
        // ll.print();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.reverse();
        ll.print();
        System.out.println(ll.itrSearch(3));
        System.out.println(ll.itrSearch(12));
        ll.removeFirst();
        ll.removeLast();
        ll.print();
        System.out.println("size of ll is:" +ll.size);
        

    }
}