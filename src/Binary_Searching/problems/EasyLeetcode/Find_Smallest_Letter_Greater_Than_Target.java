package Binary_Searching.problems.EasyLeetcode;

public class Find_Smallest_Letter_Greater_Than_Target {

    public static void main(String[] args) {
        char[] letters = {'c','f','j','x','y'};
        char target = 'i';
        char res = nextGreatestLetter(letters,target);
        System.out.println(res);
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int last = letters.length-1;

        while(start<=last){

            int mid = start+(last-start)/2;

            if(target<letters[mid]){
                last = mid-1;
            } else{
                start = mid+1;
            }

        }
        return letters[start%letters.length];
    }
}
