package Binary_Searching.problems.MeduimLeetcode;

import java.util.Arrays;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public static void main(String[] args) {

        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums,target)));

    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = search(nums,target,true);
        if(ans[0] != -1){
            ans[1] = search(nums,target,false);
        }
        return ans;

    }

    static int search(int[] nums, int target, boolean findfirst){
        int ans = -1;
        int start = 0;
        int last = nums.length-1;

        while(start<=last){

            int mid = start+(last-start)/2;

            if(target<nums[mid]){
                last = mid-1;
            } else if (target>nums[mid]) {
                start = mid+1;
            }
            else {
                ans = mid;
                if(findfirst){
                    last = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }


}
