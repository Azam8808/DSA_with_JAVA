public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public  void adddFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addMid(int idx, int data){
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int itrSearch(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    //Reverse an LinkedList
    public void revese(){
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

   public void deleteNthFromEnd(int n){
    int sz = 0;
    Node temp = head;
    while(temp != null){
        temp = temp.next;
        sz++;
    }

    if(sz == n) {
        head = head.next;
        return;
    }
    int i = 1;
    int iToFind = sz - n;
    Node prev = head;
    while(i < iToFind) {
        prev = prev.next;
        i++;
    }
    prev.next = prev.next.next;
    return;
   }
    public void print(){
        if(head == null){
            System.out.println("ll is Empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        LinkedList ll = new LinkedList();
       
        ll.adddFirst(1);
        ll.adddFirst(2);
        ll.addLast(4);
        ll.addLast(5);
        ll.addMid(2, 8);
        ll.print();
        ll.revese();
        ll.print();
        ll.deleteNthFromEnd(3);
        ll.print();
        // System.out.println(ll.itrSearch(9));
    }
    
}
