import java.util.Scanner;
public class a2{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String res=(a%2==0)?"even":"odd";  //condition and terniary operators
        System.out.println(a+" is a "+res);
    }
}
