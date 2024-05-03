// import java.util.ArrayList();
import java.util.*;
class basicList {
    public static void main(String args[]) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        // delet element in particular index number
        list.remove(2);
        System.out.println(list);
        //set element at index number
        list.set(2,10);
        System.out.println(list);
       // contains element
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
    }
}