package Binary_Searching.problems.MeduimLeetcode;

public class Search_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int[] arr2 = {4,4,6,7,0,1,4};
        System.out.println(search(arr,0));
        System.out.println(findPivotiInDuplicate(arr2));
    }
    public static int search(int[] nums, int target) {

        int pivot = findPivot(nums);

        // if you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(nums,target,0,nums.length-1);
        }

        if(nums[pivot]==target){
            return pivot;
        }

        if(target>=nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }

        return binarySearch(nums,target,pivot+1,nums.length-1);

    }

    public static int binarySearch(int[] nums,int target,int start,int end){
        while(start<=end){
            int mid = start+(end-start)/2;

            if(target<nums[mid]){
                end = mid-1;
            }
            else if(target > nums[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
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

    public static int findPivotiInDuplicate(int[] nums){
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

            // if elements at middle, start, end are equal then just skip the duplicates
            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
