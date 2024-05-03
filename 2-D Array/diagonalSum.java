import java.util.*;

public class diagonalSum {
    public static int diagonalSum(int matrix[][]){
        int sum = 0;
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix.length; j++){
        //         if(i == j){
        //             sum += matrix[i][j];
        //         }else if(i+j == matrix.length-1){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        for(int i=0; i<matrix.length; i++){
            sum += matrix[i][i];
            if(i != matrix.length-1-i) {
                sum += matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(diagonalSum(matrix));
    }
}
