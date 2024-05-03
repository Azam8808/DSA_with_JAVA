import java.util.*;
public class stairCaseSearch {

    public static boolean stairCaseSearch(int matrix[][], int key){
        int row = 0;
        int col = matrix[0].length-1;
        
        while(row < matrix.length && col >= 0) {
            if(matrix[row][col] == key){
                System.out.println("found key at("+row+","+col+")");
                return true;
            }else if(key < matrix[row][col]){
                col--;
            }else{
                row++;
            }
             System.out.println("found key at("+row+","+col+")");
        }
        System.out.println("key not found");
        return false;


    }
    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        int key = 10;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<matrix.length; i++){
          for(int j=0; j<matrix.length; j++){
            matrix[i][j] = sc.nextInt();
          }
        }
          stairCaseSearch(matrix, 0);
    }
}
