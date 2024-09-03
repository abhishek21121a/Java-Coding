import java.util.Scanner;

public class a1 {
    public static void main(String[] args)
    {
       
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        float sum=a+b+c;
        float avg=sum/3;
        int e=(int)sum;
        int s=(int)avg;

        System.out.printf("sum:%.2f",e);
        System.out.printf("\navg:%.2f",s);


        
    }
    
}
