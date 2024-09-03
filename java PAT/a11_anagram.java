import java.util.Arrays;
import java.util.Scanner;

public class a11_anagram {
    public static boolean anagram(String str1,String str2)
    {
       String s1 = str1.replaceAll("//s","").toLowerCase();
       String s2 = str2.replaceAll("//s","").toLowerCase();


       if(s1.length()!=s2.length())
       {
        return false;
       }

       char[] chararray1 = s1.toCharArray();
       char[] chararray2 = s2.toCharArray();

       Arrays.sort(chararray1);
       Arrays.sort(chararray2);
      
       return Arrays.equals(chararray1,chararray2);

    }  
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str1 = "ro hit";
        String str2 = "rohit";

        if(anagram(str1, str2))
        {
            System.out.println(str1+" and "+str2+" is a anagram");
        }
        else{
            System.out.println(str1+"and"+str2+"is not a anagram");
        }
    }

    }
    

