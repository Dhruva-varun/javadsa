package Arrays.problems;

public class Max_in_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,6,2,0,5};
        max(arr);
        max_in_Range(arr,0,5);

    }

    static void max(int[] arr){

        if(arr == null || arr.length == 0){
            System.out.println("No Elements in Array");
            return;
        }

        int maxvalue = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=maxvalue){
                maxvalue = arr[i];
            }
        }
        System.out.println(maxvalue);
    }

    static void max_in_Range(int[] arr, int start, int end){

        if(arr.length == 0){
            System.out.println("No Elements in Array");
            return;
        }

        if (start < 0 || end >= arr.length) {
            System.out.println("Index out of bounds");
            return;
        }

        if(start>end){
            System.out.println("Invalid range");
            return;
        }

        int maxvalue = arr[start];

        for (int i = start; i < end; i++) {
            if(arr[i]>=maxvalue){
                maxvalue = arr[i];
            }
        }
        System.out.println(maxvalue);
    }
}
