import java.util.*;

public class searchMaxMin {
    public static void searchMaxMin(int matrix[][]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++) {
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                } if(matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        System.out.println("("+max+ "," +min+")");
    }
    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        searchMaxMin(matrix);
    }
}
