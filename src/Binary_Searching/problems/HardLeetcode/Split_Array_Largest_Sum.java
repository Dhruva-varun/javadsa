package Binary_Searching.problems.HardLeetcode;

public class Split_Array_Largest_Sum {
    public static void main(String[] args) {
        int[] nums ={7,2,5,10,8};
        System.out.println(splitArray(nums,2));
    }

    public static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for(int num: nums){
            start = Math.max(start,num);  // in the end of the loop this will contain the max item of the array
            end += num;
        }

        // binary search
        while (start < end) {
            // try for the middle as potential ans
            int mid = start + (end - start) / 2;

            // calculate how many pieces you can divide this in with this max sum

            int sum = 0;
            int subArrays = 1;

            for(int num: nums){
                if(sum+num>mid){
                    // you cannot add this in this subarray, make new one
                    // say you add this num in new subarray, then sum = num
                    sum=num;
                    subArrays++;
                }
                else{
                    sum+=num;
                }
            }

            if(subArrays > k){
                start = mid+1;
            }
            else{
                end = mid;
            }

        }
        return end; // here start == end == mid
    }
}
