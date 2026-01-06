package Arrays.problems;

import java.util.Arrays;

public class Swap_And_Reverse_Array {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 3, 8, 10, 4, 7};
        swap(arr,2,5);
        System.out.println(Arrays.toString(arr));
        reverse_array(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse_array(int[] arr){
        int start = 0;
        int last = arr.length - 1;

        while(start<last){
            swap(arr,start,last);
            start++;
            last--;
        }
    }
}
