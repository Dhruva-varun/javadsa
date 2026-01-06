package Arrays;

public class Linear_search {
    public static void main(String[] args) {
        int[] arr = {4,6,2,1,9,10,25};
        int i = search(arr,10);
        System.out.println(i==-1 ? "Element not found" : "Element found at index "+ i);
        search_in_range(arr,6,1,5);
    }

    static int search(int[] arr, int element){
        if(arr == null || arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }

    static void search_in_range(int[] arr, int element,int start,int end){
        if(arr == null || arr.length == 0){
            System.out.println("No Elements in Array");
            return;
        }

        if (start < 0 || end >= arr.length) {
            System.out.println("Index out of bounds");
            return;
        }

        if(start>end){
            System.out.println("Invalid range");
            return;
        }

        for (int i = start; i <= end; i++) {
            if(arr[i] == element){
                System.out.println("Element found at index "+ i);
                return;
            }
        }
        System.out.println("Element not found");
    }
}
