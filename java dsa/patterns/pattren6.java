public class pattren6 {
    static void p(int n){
        int num=0;
     for(int i=0;i<n;i++)
     {
        for(int j=0;j<n-i;j++)
        {
            System.out.print(" ");
        }
        for(char j='A';j<='A'+i;j++ )
        {
            System.out.print(j);
        }
        if(i!=0 && i!=1)
        {
            
            for(char j='A';j<='A'+num;j++)
            {
              System.out.print(j);
              num=num+1;
            }
        }
        System.out.println();
     }
    }
    public static void main(String args[]){
        int n=5;
        p(n);
    }
    
}
