// Frinds Pairing problem

public class prob13 {

    public static int frindsPairing(int n) {
        // base case
        if(n == 1 || n == 2) {
            return n;
        }

        // single choice
        int fnm1 = frindsPairing(n-1);

        // pair choice
        int fnm2 = frindsPairing(n-2);
        int pairWays = (n-1)*fnm2;

        // total ways
        int totWays = fnm1 + pairWays;
        return totWays;
    }
    public static void main (String nargs[]) {
        int n = 3;
        System.out.println(frindsPairing(n));
    }
}
