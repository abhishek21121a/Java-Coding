package array;

import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }
static int rev(int[] arr){
      
        int start=0;
        int end=arr.length-1;
    while(start<end)
    {
        swap(arr,start,end);
        start++;
        end--;
    }
    }
    static int swap(int[] arr,int start,int end){
        
    }

}
