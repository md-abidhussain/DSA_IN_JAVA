package Conditionals_and_Loops;

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int original = number;

        int sum = 0;

        while (number > 0){
            int digit = number % 10;
            sum = sum + ( digit * digit * digit);
            number = number / 10;
        }

        if (sum == original) {
            System.out.println("Armstrong Number");
        } else{
            System.out.println("Not a Armstrong Number");
        }


    }
}
