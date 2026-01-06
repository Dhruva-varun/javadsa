package Arrays.problems;

public class Max_Min_in_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,6,2,-5,5};
        max(arr);
        max_in_Range(arr,0,5);
        System.out.println(min(arr));

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

    static int min(int[] arr){

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");   // empty array
        }

        int minvalue = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<minvalue){
                minvalue = arr[i];
            }
        }
        return minvalue;
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

        for (int i = start; i <= end; i++) {
            if(arr[i]>=maxvalue){
                maxvalue = arr[i];
            }
        }
        System.out.println(maxvalue);
    }
}
