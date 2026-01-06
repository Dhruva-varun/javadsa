package Arrays.problems;

public class Search_in_String {
    public static void main(String[] args) {
        String str = "varun Druva";
        int i = search(str,'n');
        System.out.println(i==-1 ? "Element not found" : "Element found at index "+ i);
    }

    static int search(String str, char ch){

        if (str == null || str.length() == 0) {
            return -1;
        }

        for (int i = 0; i < str.length(); i++) {                //for(char ch : str.toCharArray())   alternate for loop
            if(ch==str.charAt(i)) {
                //if (Character.toLowerCase(ch) == Character.toLowerCase(str.charAt(i)))              for case Case-insensitive search
                return i;
            }
        }
        return -1;

//        return str == null ? -1 : str.indexOf(ch);     // TC = O(1) best version

    }
}
