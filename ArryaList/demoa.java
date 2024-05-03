class demoa {
    public static void selectionSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            int minPos = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[minPos] > arr[j]) {
                    int temp = arr[minPos];
                    arr[minPos] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main (String args[]) {
        int arr[] = {5,4,1,3,2};
        selectionSort(arr);
        for(int j=0; j<arr.length; j++) {
            System.out.print(arr[j]+" ");
        }
    }
}