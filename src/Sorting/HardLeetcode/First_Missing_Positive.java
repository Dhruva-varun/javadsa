package Sorting.HardLeetcode;

public class First_Missing_Positive {

    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        System.out.println(firstMissingPositive(arr));
    }

    public static int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correctPos = nums[i]-1;
            if(nums[i]>0 && nums[i]<nums.length+1 && nums[i] != nums[correctPos]){
                swap(nums,i,correctPos);
            }else{
                i++;
            }
        }

        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }

        return nums.length+1;
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
