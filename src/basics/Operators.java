package basics;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the operator: ");
        String op = in.nextLine();
        System.out.print("Enter Number!: ");
        int num1 = in.nextInt();
        System.out.print("Enter Number!: ");
        int num2 = in.nextInt();

        if (op.equals("+")) {
            System.out.println(num1 + num2);
        }
        else if (op.equals("-")) {
            System.out.println(num1 - num2);
        }
        else if (op.equals("*")) {
            System.out.println(num1 * num2);
        }
        else if (op.equals("/")) {
            System.out.println(num1 / num2);
        }
        else {
            System.out.println(num1 % num2);
        }

    }
}
