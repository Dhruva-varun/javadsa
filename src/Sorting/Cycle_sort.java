package Sorting;

import java.util.Arrays;

public class Cycle_sort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cycle(int[] arr){
        int i = 0;
        while( i< arr.length){
            int correctPos = arr[i]-1;
            if(i != correctPos){
                swap(arr,i,correctPos);
            }else{
                i++;
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
