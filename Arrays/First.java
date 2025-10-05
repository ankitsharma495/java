package Arrays;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        int[] arr = new int[10];

        Scanner input =  new Scanner(System.in);
        for(int i =0 ; i<arr.length ; i++){
            arr[i] = input.nextInt();
        }
        for(int num:arr){
            System.out.print(num + " ");
        }

    }
    
}
