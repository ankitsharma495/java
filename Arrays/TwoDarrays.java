package Arrays;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.*;

public class TwoDarrays {

    public static void main(String[] args) {
        int[][] mat = new int[3][3];
        Scanner input = new Scanner(System.in);
        // how to take inputs
        for(int row = 0 ; row<mat.length ; row++){
            for(int col= 0; col<mat[row].length; col++){

                mat[row][col] = input.nextInt();
            }
        }

        //three ways to output this 
        for(int row = 0 ; row<mat.length ; row ++){
            for(int col = 0 ; col<mat[row].length ; col++){
                System.out.println(mat[row][col]);

            }
            System.out.println();
        }

        //second way
        for(int i =0 ; i<mat.length; i++){
            System.out.print(Arrays.toString(mat[i]));
        }

        //third way
        for(int[] x : mat){
            System.out.println(Arrays.toString(x));
        }

        
    }
    
}
