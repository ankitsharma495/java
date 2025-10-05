package functions;
import java.util.Scanner;

public class Even {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if(isEven(a)){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }    
    }

    static boolean isEven(int num1){
        if(num1%2==0) return true;
        else{
            return false;
        }
    }
}
