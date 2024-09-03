
import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            List.add(sc.nextInt());
        }
        System.out.println(List);
    }
}

// import java.util.ArrayList;
// import java.util.Scanner;

// public class Arraylist {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         ArrayList<Integer> list = new ArrayList<>();

//         System.out.println("Enter 5 integers:");

//         for (int i = 0; i < 5; i++) {
//             System.out.print("Enter integer #" + (i + 1) + ": ");
//             list.add(sc.nextInt());
//         }

//         System.out.println("You entered: " + list);

//         // Don't forget to close the Scanner to avoid resource leaks
//         sc.close();
//     }
// }

