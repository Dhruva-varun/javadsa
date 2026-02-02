package Sorting.EasyLeetcode;

public class Missing_Number {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correctPos = nums[i];
            if(nums[i] < nums.length && nums[i]!=nums[correctPos]){
                swap(nums,i,correctPos);
            }else{
                i++;
            }
        }

        for( i = 0;i<nums.length;i++){
            if(i!=nums[i]){
                return i;
            }
        }
        return nums.length;
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
