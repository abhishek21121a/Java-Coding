public class leet1 {
    public static void main(String[] args) {
       
      //multiplication of digits
        int num=234;
        int mul=1;
        int r;
        int sum=0;
        int  n=num;
        while(n>0)
        {
          r=n%10;
          mul=mul*r;
          sum=sum+r;
          n=n/10;
        }
        //  System.out.println("mul="+mul+"\nsum="+sum);
       if(mul!=0 && sum!=0){
        int res;
        res=mul-sum;
        System.out.println(res);
       }

// //addition of digits
//         int sum=0;
//         int t;
//         int s=num;
//         while(s>0)
//         {
//           t=s%10;
//           sum=sum+t;
//           s=s/10;
//         }
//          System.out.println(sum);
        }
        
}
