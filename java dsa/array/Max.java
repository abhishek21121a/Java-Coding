public class Max {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(max(arr, 1,7));
    }
      
static int max(int[] arr, int start,int end){
   int max=arr[start];
   if(end<start)
        return -1;
   if(arr == null)
        return -1;
      for(int i=start;i<end;i++){
             if(arr[i]>max){
                max=arr[i];
             }
             
      }
return max;
}
  }

