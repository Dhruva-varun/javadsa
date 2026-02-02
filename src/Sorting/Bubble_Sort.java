package Sorting;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {5, -3, 4, 1, -2, 0};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Bubble(int[] arr){
        boolean swapped;
        for(int i=0; i< arr.length;i++){
            swapped = false;
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            // !false = true
            if(!swapped){
                break;
            }
        }
    }

    public static void swap(int[] arr, int first, int second){
        int temp= arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
