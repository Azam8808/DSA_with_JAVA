public class binCoff {

    public static int factorial (int n)  {
        int fact = 1;
        for(int i=1; i<=n; i++) {
            fact = fact * i;
        }
        return fact;
    }   

    public static int binCoff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoff = fact_n/(fact_r*fact_nmr);
        return binCoff;
    }
    public static void main (String args[]) {
       int binCoff =  binCoff(6, 2);
       System.out.println(binCoff);

    }
    
}
