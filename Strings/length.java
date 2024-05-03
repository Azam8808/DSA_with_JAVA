import java.util.*;
public class length {
    public static void main(String args[]) {
        String firstName = "MOhd";
        String lastName = "Azam";
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(firstName.length());
        System.out.println(name.length());
   
        // Concatenation
        String fullName = firstName+" "+lastName;
        System.out.println(fullName);

    }
}
