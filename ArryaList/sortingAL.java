import java.util.ArrayList;
import java.util.Collections;
//import java.util.*;
public class sortingAL {
    public static void main (String args[]) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(9);
        list.add(6);
        System.out.println(list);
        //sort only ascending order
        Collections.sort(list);
        System.out.println(list);
        //for descending order use Comparator - functoin logic
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
    
}
