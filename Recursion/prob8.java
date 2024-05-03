// Write a function to find the last occurance of an element in an Array

public class prob8 {

    public static int lastOcc(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }
 
        // look forward
        int isFound = lastOcc(arr, key, i+1);
        if(isFound != -1){
            return isFound;
        }

        // campare with self
        if(arr[i] == key) {
            return i;
        }
        return isFound;
    }
    public static void main (String args[]) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int key = 5;
        System.out.println(lastOcc(arr, key, 0));
    }
}
