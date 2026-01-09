package Binary_Searching.problems;

public class Find_position_of_an_element_in_a_sorted_array_of_infinite_numbers {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(findPositions(arr, target));
    }

    static int findPositions(int[] arr, int element){
        // first start with a box of size 2
        int start= 0;
        int end= 1;

        // condition for the target to lie in the range
        while (element>arr[end]){
            int newStart = end+1;  // this is my new start
            // double the box value
            // end = previous end + sizeofbox*2
            end = end+(end-start+1)*2;
            start = newStart;
        }
        return binarySearch(arr,element,start,end);
    }

    static int binarySearch(int[] arr, int element, int start,int end){

        while(start<=end){
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start+(end-start)/2;

            if(element< arr[mid]){
                end = mid-1;
            } else if (element>arr[mid]) {
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
