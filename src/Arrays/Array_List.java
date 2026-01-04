package Arrays;

import java.util.*;

public class Array_List {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//  Syntax

        ArrayList<Integer> list = new ArrayList<>(5);

//  Add
        list.add(67);
        list.add(234);
        list.add(654);
        list.add(43);
        list.add(654);
        list.add(8765);

//  contains
        System.out.println(list.contains(765432));

//  output
        System.out.println(list);

//  set
        list.set(0, 99);

//  remove
        list.remove(2);

        System.out.println(list);

// input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

// get item at any index
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }

        System.out.println(list);


//  2D Array List

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        // initialisation
        for (int i = 0; i < 3; i++) {
            arr.add(new ArrayList<>());
        }

        // add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr.get(i).add(in.nextInt());
            }
        }

        System.out.println(arr);
    }
}
