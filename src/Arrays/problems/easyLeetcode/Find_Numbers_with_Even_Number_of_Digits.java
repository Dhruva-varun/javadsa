package Arrays.problems.easyLeetcode;

public class Find_Numbers_with_Even_Number_of_Digits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int ans = findNumbers(nums);
        System.out.println(ans);
    }
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int num: nums){
            if(even(num)){
                count++;
            }
        }
        return count;

    }

    public static boolean even(int num){
        return numDigits(num)%2 == 0;
    }

    public static int numDigits(int num){
        int digits = 0;

        if(num < 0){
            num = num*-1;    //if num is negative convert to positive
        }

        // while(num>0){
        //     num = num/10;      // using loop not optimized
        //     digits++;
        // }
        // return digits;

        return (int)(Math.log10(num)+1);    // optimized

    }
}
