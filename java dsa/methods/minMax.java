package methods;

import java.util.Scanner;

public class minMax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int first = sc.nextInt();
        System.out.println("Enter the second number");
        int second = sc.nextInt();
        System.out.println("Enter the third number");
        int third = sc.nextInt();
       System.out.println("largest number"+largest(first, second, third)+"\nsmallest number"+smallest(first, second, third));
    }

    public static int largest(int first,int second,int third ){
        int max=first;
        if(second>max){
            max=second;
        }
        if(third>first){
            max=third;
        }
        return max;
    }
    
    public static int smallest(int first,int second,int third){
        
        if(first<second && first<third){
            return first;
        }
        else if(second<first && second<third){
            return second;
        }
        else{
        return third;
    }
    }
}
