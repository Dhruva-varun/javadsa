package Sorting;

import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = {5, -3, 4, 1, -2, 0};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int lastIndex = arr.length-i-1;
            int maxIndex = 0;
            for (int j = 0; j < lastIndex; j++) {
                if(arr[maxIndex]<arr[j]){
                    maxIndex = j;
                }
            }
            swap(arr,maxIndex,lastIndex);
        }
    }

    public static void swap(int[] arr, int first, int second){
        int temp= arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
