import java.util.Scanner;
public class a8 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array:");
        int size = sc.nextInt();
        int[] n = new int[size];
        int grt=0;
        
        System.out.println("enter the array elements:");
        for(int i=0;i<size;i++){
        System.out.print("enter the element "+(i+1)+":"); 
        n[i] = sc.nextInt();
        
          
        }
        grt = n[0];
        for (int i = 1; i < size; i++) {
            if (n[i] > grt) {
                grt = n[i];
            }
        }

       /*  if(grt<n[i]){
            grt=n[i];
         }
        i=0;*/

        System.out.println(grt+"is the greatest number");
    }
    
}
