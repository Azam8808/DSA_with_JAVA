// Tiling problem

public class prob11 {

    public static int tilingProblem(int n) {
        // base case
        if(n == 0 || n == 1) {
            return 1;
        }

        //kaam
        // horizontally choice
        int fnm2 = tilingProblem(n-2);
        
        // vertically choice
        int fnm1 = tilingProblem(n-1);

        int totWays = fnm1+fnm2;
        return totWays;
    }
    public static void main (String agrs[]) {
        int n = 3;
        System.out.println(tilingProblem(n));
    }
}
