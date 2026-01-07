package Recursion;

public class Sum {

    public static void main(String[] args) {
        print(5);
    }
    //prints from 1 to n
    public static void print(int n){

        if(n==0) return ;
        print(n-1);
        System.out.println(n);
        
    }

    //print n to 1
     public static void print2(int n){

        if(n==0) return ;
       
        System.out.println(n);
        print(n-1);
    }
    
}
