//write a program that takes input from the user continously untill 0 is entered 
//and print the count and sum of all the numbers entered by user.

import java.util.Scanner;



public class a5{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int sum=0;
        int count=0;
       
           
      
            while(v!=0)
            {
            v=sc.nextInt();
              sum+=v;
              count++;
            }
    
            System.out.println("the sum of the total no.you entered"+sum+"count"+count);

        }
        
    }
