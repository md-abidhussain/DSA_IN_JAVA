package Conditionals_and_Loops;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int hcf = a;

        int x = a;
        int y = b;

        while (y != 0) {

            int temp = y;
            y = x % y;
            x = temp;
        }
        hcf = x;
        int LCM = (a * b)/ hcf;
        System.out.println("LCM = " + LCM);
    }
}
