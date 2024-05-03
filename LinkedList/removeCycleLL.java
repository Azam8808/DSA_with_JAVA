public class removeCycleLL {
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
    public static void removeCycle() {
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                cycle = true;
                break;
            }
        }
        if(cycle == false) {
            return;
        }
        // Find meeting point
        slow = head;
        Node prev = null;
        while(slow != fast) {
            prev = fast;
            fast = fast.next;
        }
        //remove cycle -> last.next = null
        prev.next = null;
    }
    public static void main (String args[]) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        removeCycle();
 
    }
}
