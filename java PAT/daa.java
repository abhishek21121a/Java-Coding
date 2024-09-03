import java.io.*;
 public class Gfg{
 

public static boolean isSubsetSum(int set[], int n, int d)
{

if (d == 0)
return true;
if (n == 0)
 return false;
 
if (set[n - 1] > d)
 return isSubsetSum(set, n - 1, d);

return isSubsetSum(set, n - 1, d)|| isSubsetSum(set, n - 1, d - set[n - 1]);
}

 public static void main(String args[])
{
int set[] = { 1, 2, 5, 6, 8 };
int d = 9;
 int n = set.length;
 if (isSubsetSum(set, n, d) == true)
 {
    System.out.println("found a subset " + " with given d");
 }
else
 System.out.println("No subset with" + " given d");
}
}