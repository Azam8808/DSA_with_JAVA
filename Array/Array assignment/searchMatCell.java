import java.util.*;

public class searchMatCell {
    public static void maxSearchCell(int matrix[][]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Max cell of matrix is\n" +max);
    }
    public static void minSearchCell (int matrix[][]) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix.length; j++) {
                if(matrix[i][j] < min) {
                   min = matrix[i][j];
                }
            }
        }
        System.out.println("Min cell is:" + min);
    }

    public static boolean searchCell(int matrix[][], int cell) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == cell) {
                    System.out.print("Found cell at:(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("cell not Found");
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // for output
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int cell = sc.nextInt();
        searchCell(matrix, cell);
         System.out.println();
        maxSearchCell(matrix);
        minSearchCell(matrix);
    }
}
