import java.util.ArrayList;

public class monotonicAL1 {
    public static boolean monotonicAL(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    return false;
                }
                
            }
        }
        return true;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        // list.add(2);
        list.add(2);
         //monotonicAL(list);
        System.out.println(monotonicAL(list));
    }

}
