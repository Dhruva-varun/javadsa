package Binary_Searching.problems.HardLeetcode;

public class Find_in_Mountain_Array {
    interface MountainArray {
        public int get(int index);
        public int length();
    }

    // Custom implementation for testing
    static class MountainArrayImpl implements MountainArray {
        private int[] arr;

        MountainArrayImpl(int[] arr) {
            this.arr = arr;
        }

        public int get(int index) {
            return arr[index];
        }

        public int length() {
            return arr.length;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,3,1}; // Mountain array
        MountainArray mountainArr = new MountainArrayImpl(nums);

        int target = 3;

        int result = findInMountainArray(target, mountainArr);

        System.out.println("Target found at index: " + result);
    }


    public static int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakInMountainArray(mountainArr);
        int firstTry = orderAgnosticBS(mountainArr, target, 0, peak);
        if(firstTry!=-1){
            return firstTry;
        }
        return orderAgnosticBS(mountainArr, target, peak+1, mountainArr.length()-1);
    }

    public static int peakInMountainArray(MountainArray mountainArr){
        int start = 0;
        int end = mountainArr.length()-1;

        while(start<end){
            int mid = start+(end-start)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1)){
                        // you are in dec part of array
                        // this may be the ans, but look at left
                        // this is why end != mid - 1
                end = mid;
            }
            else{
                start = mid+1;  // because we know that mid+1 element > mid element
            }
        }
        return start; // in the end, start == end // or return end as both are =
    }

    public static int orderAgnosticBS(MountainArray mountainArr, int target, int start, int end){
        boolean isAsc = mountainArr.get(start)<mountainArr.get(end);

        while(start<=end){
            int mid = start+(end-start)/2;

            if(mountainArr.get(mid)==target){
                return mid;
            }

            if (isAsc) {
                if (target < mountainArr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > mountainArr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
