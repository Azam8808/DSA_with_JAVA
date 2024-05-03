// Write a function to find the first occurance of an element in an Array

public class prob7 { 

    public static int firstOcc(int arr[], int key, int i) {
        if(arr[i] == key) {
            return i;
        }
        if(i == arr.length) {
            return -1;
        }
        return firstOcc(arr, key, i+1);
    }
     public static void main (String args[]) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int key = 9;
        System.out.println(firstOcc(arr, key, 0));
     }
}
