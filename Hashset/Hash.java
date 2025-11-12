package Hashset;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        
        //Creation of Hashset 
        HashSet<Integer> set = new HashSet<>();

        //inserting in set
        set.add(11);
        System.out.println(set);

        //searching in set
        //inside for loop
        set.contains(11);



       //deletion
       set.remove(11);
       System.out.println(set);

        // Convert HashSet to int[]
        int[] result = new int[set2.size()];
        int i = 0;
        for (int num : set2) {
            result[i++] = num;
        }

    }
    
}
