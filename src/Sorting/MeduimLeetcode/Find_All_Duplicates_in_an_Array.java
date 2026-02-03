package Sorting.MeduimLeetcode;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Duplicates_in_an_Array {

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correctPos = nums[i]-1;
            if(nums[i] != nums[correctPos]){
                swap(nums,i,correctPos);
            }else{
                i++;
            }
        }

        List<Integer> res = new ArrayList<>();
        for(i=0;i<nums.length;i++){
            if(nums[i] != i+1){
                res.add(nums[i]);
            }
        }
        return res;
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
