package methods;

public class scoping {
    public static void main(String[] args) {
         
        int n=10;
        int count=1;
        a=100;
        for(int i=0;i<n;i++)
        {
            //int a=1000 will only exists in this block only
             int  a=1000;
           System.out.println(a);
            count=count+1;
        }
        int a=40;
        int i=0;
        
        System.out.println(i+" "+a+"   "+  count); 
    }
}
