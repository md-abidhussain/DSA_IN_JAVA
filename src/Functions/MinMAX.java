package Functions;

import java.util.Scanner;

public class MinMAX {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int result = max(a,b,c);
        System.out.println("max is: " + result);
        int result2 =  min(a,b,c);
        System.out.println("min is: " + result2);
    }

    static int max(int a, int b, int c){
        int max = a;

        if (b > max){
            max = b;

        }
        if (c > max) {
            max = c;
        }
        return max;
    }


    static int min(int a, int b, int c){
        int min = a;

        if (b < min){
            min = b;

        }
        if (c < min) {
            min = c;

        }
        return min;
    }









}
