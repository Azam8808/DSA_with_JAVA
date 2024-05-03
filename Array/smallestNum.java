public class smallestNum {
    public static int getSmallest(int numbers[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(smallest>numbers[i]) {
            smallest = numbers[i];

        }
    }
        return smallest;
    }
    public static void main(String args []){
        int numbers[] = {11,2,3,4,55,1,90};
        int Smallest = getSmallest(numbers);
        System.out.println("Smallest number is:" + Smallest);
    }
    
}
