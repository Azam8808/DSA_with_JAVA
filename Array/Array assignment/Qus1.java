//package Array assignment;
import java.util.*;

public class Qus1 {
    public static boolean  trueOrfalse(int nums[]) {
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i]==nums[j]) {
                    return true;
                } 
            }
        }
        return false;
       
    }
    public static void main(String args[]) {
        int nums[] = new int[4];
        Scanner sc = new Scanner(System.in);
         nums[0] = sc.nextInt();
         nums[1] = sc.nextInt();
         nums[2] = sc.nextInt();
         nums[3] = sc.nextInt();
        System.out.println(trueOrfalse(nums));

    }
    
}
