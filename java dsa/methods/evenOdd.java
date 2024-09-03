package methods;

import java.util.Scanner;

public class evenOdd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
       if(iseven(n)){
        System.out.println(n+" is even");
       }
       else{
        System.out.println(n+" is odd");
       }
    }
    public static boolean iseven(int n){
        return n % 2 == 0;
    }
    public static boolean isodd(int n){
       return n % 2 != 0;
    }
}
