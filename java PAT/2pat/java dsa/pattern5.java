public class pattern5 {
    public static void main(String args[]){
    int num=0;
    int n=5;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<=i;j++)
        {
            // System.out.print(num);
            
            if(num%2==0)
            System.out.print(" 1 ");
            else
            System.out.print(" 0 ");
            num=num+1;
        }
        System.out.println();
    }
    
}
}
