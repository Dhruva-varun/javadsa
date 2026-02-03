package Sorting.EasyLeetcode;

import java.util.Arrays;

public class Set_Mismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correctPos = nums[i]-1;
            if(nums[i] != nums[correctPos]){
                swap(nums,i,correctPos);
            }
            else{
                i++;
            }
        }

        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return new int[]{nums[i],i+1};
            }
        }

        return new int[]{-1,-1};
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
