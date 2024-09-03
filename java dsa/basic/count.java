import java.util.*;


public class count {
        public static int countDigits(int n){  
            // Write your code here.
           int c=0;
            while(n>0)
            {
                c=c+1;
                n = n / 10;
            }
            return c;
            
        }
        
        public static void main(String[] args){   //short cut psvm
            int n = 344;
            int digits=countDigits(n);
            System.out.println(digits);
        }
       
    }


