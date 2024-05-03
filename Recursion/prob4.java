//print sum of first n natural numbers

public class prob4 {

    public static int printSum(int n) {
        if(n == 1) {
            return 1;
        }
        int Snm1 = printSum(n-1);
        int Sn = n + Snm1;
        return Sn;
    }
    public static void main (String args[]) {
        int n = 7;
        System.out.println(printSum(n));
    }
}
