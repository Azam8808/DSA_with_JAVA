import java.util.*;
class basicString {
    public static void main (String args[]) {
        char arr[] = {'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("xyz");
       
        // String are IMMUTABLE
        // System.out.println(str);
        // System.out.println(str2);
        // System.out.println(arr);
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
    }
}