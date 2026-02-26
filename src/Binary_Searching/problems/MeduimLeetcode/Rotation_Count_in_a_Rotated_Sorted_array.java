package Binary_Searching.problems.MeduimLeetcode;
// GFG question
public class Rotation_Count_in_a_Rotated_Sorted_array {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(roatationCount(arr));
    }

    public static int roatationCount(int[] arr){
        int pivot = findPivot(arr);
        return pivot+1;
    }

    public static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid =start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }

            if(nums[mid]<=nums[start]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }


        }
        return -1;
    }
}
