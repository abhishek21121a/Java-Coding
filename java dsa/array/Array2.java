import java.util.Arrays;
import java.util.Scanner;
public class Array2{
    public static void main(String[] args) {

        // another way of printing 2d array

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];
        System.out.println("enter the values");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
               arr[i][j]=sc.nextInt();
            }
        }
           
        for(int[] a:arr)
        {
            System.out.println(Arrays.toString(a));
        }

}
    }


