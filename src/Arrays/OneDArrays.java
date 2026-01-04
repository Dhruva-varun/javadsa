package Arrays;
import java.util.*;

public class OneDArrays {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

//  syntax
        /* datatype[] variable_name = new datatype[size];
           store 5 roll numbers:
           int[] rnos = new int[5];
           or directly
           int[] rnos2 = {23, 12, 45, 32, 15};
        */
           int[] ros; // declaration of array. ros is getting defined in the stack
           ros = new int[5]; // initialisation: actually here object is being created in the memory (heap)

           System.out.println(ros[1]); //default value = 0

           String[] arr1 = new String[4];

           System.out.println(arr1[0]);  //default value = null


//  Input

        // array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 233;
        arr[3] = 543;
        arr[4] = 3;
        // [23, 45, 233, 543, 3]
        System.out.println(arr[3]);

        // input using for loops
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

//  Output

        System.out.println(Arrays.toString(arr));    //using Arrays.toString()

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for(int num : arr) {              // enhanced for-loop : for every element in array, print the element
            System.out.print(num + " ");  //  here num represents element of the array
        }

        // System.out.println(arr[5]); // indexOutOfBoundException

//  array of objects - string is an object

        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

//  modify

        str[1] = "varun";
        System.out.println(Arrays.toString(str));

//Array calling Functions

        change(arr);
        System.out.println(Arrays.toString(arr));

    }

//Array passing Functions
    static void change(int[] nums) {
        nums[0] = 99;
    }
}
