package Binary_Searching.problems;

public class Ceiling_and_Floor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 1;
        int ans = ceiling(arr, target);
        int res = floor(arr, target);
        System.out.println(ans+", "+res);
    }

    // return the index of smallest no that is >= target
    static int ceiling(int[] arr, int target){
        // but what if the target is greater than the last/greatest number in the array
        if(target>arr[arr.length-1]){
            return -1;
        }

        int start = 0;
        int last = arr.length-1;

        while(start<=last){

            int mid = start+(last-start)/2;

            if(target<arr[mid]){
                last = mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;
            }
            else {
                return arr[mid];
            }
        }
        return arr[start];
    }

    // return the index of greatest number that is <= target
    static int floor(int[] arr, int target){
        // but what if the target is less than the first/smallest number in the array
        if(target<arr[0]){
            return -1;
        }

        int start = 0;
        int last = arr.length-1;

        while(start<=last){

            int mid = start+(last-start)/2;

            if(target<arr[mid]){
                last = mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;
            }
            else {
                return arr[mid];
            }
        }
        return arr[last];
    }
}

