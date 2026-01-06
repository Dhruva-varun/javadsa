package Arrays.problems;

public class Max_Min_in_2D_array {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };

        System.out.println(max(arr));
        System.out.println(min(arr));

    }

    static int max(int[][] arr){

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");   // empty array
        }

        int maxvalue = Integer.MIN_VALUE;
        boolean found = false;   //No elements in 2D array

        for (int[] ints : arr) {

            if (ints == null || ints.length == 0) continue;  // no elements in any row then skip the loop

            for(int elements : ints){
                if (!found || elements > maxvalue) {
                    maxvalue = elements;
                    found = true;
                }
            }

        }
        if (!found) {
            throw new IllegalArgumentException("No elements in 2D array");
        }
        return maxvalue;
    }

    static int min(int[][] arr){

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        int minvalue = arr[0][0];

        for (int[] ints : arr) {

            if (ints == null || ints.length == 0) continue;

            for(int element : ints){
                if (element < minvalue) {
                    minvalue = element;
                }
            }

        }
        return minvalue;
    }

}
