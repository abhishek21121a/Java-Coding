import java.util.Scanner;
public class main {
    public static void main(String[] args){
        print(1);
    }

    public static void print(int n){
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
