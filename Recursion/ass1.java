public class ass1 {

    public static void occ(int arr[], int key, int i) {
        // base case
        if(i == arr.length) {
            return;
        }

       
        if(arr[i] == key) {
            System.out.print(i+" ");
          
        }
         occ(arr, key, i+1);
    }
    public static void main (String args[]) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        int key = 2;
        occ(arr, key, 0);
    }
    
}
