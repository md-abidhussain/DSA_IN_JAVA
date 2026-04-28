package Conditionals_and_Loops;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        /*int hcf = 1;
        int min = Math.min(a,b);

        for (int i = 1; i <= min; i++){
            if (a % i == 0 && b % i == 0){
                hcf = i;
            }
        }
        System.out.println(hcf);*/


        // HCF_Euclid

        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("HCF= " + a);
    }
}
