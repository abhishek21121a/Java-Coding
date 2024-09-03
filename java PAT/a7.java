//UGLY NUMBER

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class a7 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value:");
        int n=s.nextInt();

        while(n>1)
        {
            if(n%2==0)
            {
                n=n/2;
            }
            else if(n%3==0)
            {
                n/=3;
            }
            else if(n%5==0)
            {
                n/=2;
            }
            else break;
        }
        if(n==1)
        {
            System.out.println("TRUE");
        }
        else {
            System.out.println("false");
        }
 
    }
}
