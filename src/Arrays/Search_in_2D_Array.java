package Arrays;

import java.util.Arrays;

public class Search_in_2D_Array {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };

        int[] indexes = search(arr,99);
        System.out.println(Arrays.toString(indexes));

    }

    static int[] search(int[][] arr, int element){
        // Edge case: null or empty matrix
        if (arr == null || arr.length == 0) {
            return new int[]{-1, -1};
        }

        for (int i = 0; i < arr.length; i++) {

            // Edge case: null or empty row
            if (arr[i] == null || arr[i].length == 0) {      // without code works, but we can safely skip empty rows
                continue;
            }

            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == element){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
