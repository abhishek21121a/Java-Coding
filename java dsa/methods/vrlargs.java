package methods;

import java.util.Arrays;
//variable length arguments
public class vrlargs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,7,89,00);//any length of values can print
        multiple(2,4,"rohit");
    }
    static void  fun(int...v){ //we can also use String,char,int
        System.out.println(Arrays.toString(v));
     }

    static void multiple(int a,int b,String...v){
        System.out.println(Arrays.toString(v));
    }

}

