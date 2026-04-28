package Functions;

import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        fun(4,5,6,7,8,9,10);
        multiple(50,100, "Hello", "Abid");
    }

    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }


    static void multiple(int a , int b , String...s){
        //System.out.println(Arrays.asList(a,b,s));
    }
}
