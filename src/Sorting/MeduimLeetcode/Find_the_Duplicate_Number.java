package Sorting.MeduimLeetcode;

public class Find_the_Duplicate_Number {
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] nums) {
        int i = 0;
        while(i<nums.length){
            if(nums[i]!=i+1){
                int correctPos = nums[i]-1;
                if(nums[i]!=nums[correctPos]){
                    swap(nums,i,correctPos);
                }else{
                    return nums[i];
                }

            }
            else{
                i++;
            }

        }
        return -1;
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
