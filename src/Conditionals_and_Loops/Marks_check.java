package Conditionals_and_Loops;

import java.util.Scanner;

public class Marks_check {
    public static void main(String[] args) {
        /*int n = 2;

        for (int i = 1; i <= 2; i++){
            if (n % n == 0 || n % 1 == 0) {
                System.out.println("Prime Number");

            }
        }*/


        Scanner input = new Scanner(System.in);
        int user_clicks;
        do {
            System.out.println("Enter 0 or 1 to proceed");
            user_clicks = input.nextInt();
            if (user_clicks == 1) {
                System.out.println("Enter the marks");
                int marks = input.nextInt();

                if (marks >= 90) {
                    System.out.println("This is Good");
                } else if (marks >= 60) {
                    System.out.println("This is also Good");

                } else {
                    System.out.println("This is Good as well");

                }
            }

        } while (user_clicks != 0);
        input.close();
    }
}
