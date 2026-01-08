package Arrays.problems.easyLeetcode;

public class Richest_Customer_Wealth {
    public static void main(String[] args) {
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(accounts));
    }


//    public int maximumWealth(int[][] accounts) {
//        int maxwealth = Integer.MIN_VALUE;
//        for(int i= 0;i<accounts.length;i++){
//            int sum = 0;
//            for(int j=0;j<accounts[i].length;j++){
//                sum = sum+accounts[i][j];                                     //not the best solution
//            }
//            if(maxwealth<sum){
//                maxwealth = sum;
//            }
//        }
//        return maxwealth;
//    }

    public static int maximumWealth(int[][] accounts) {

        int maxwealth = Integer.MIN_VALUE;

        for(int[] i: accounts){
            int sum = 0;
            for(int j: i){
                sum += j;
            }
            maxwealth = Math.max(maxwealth,sum);
        }
        return maxwealth;
    }
}
