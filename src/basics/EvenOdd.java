package basics;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Enter Number " + number);
        boolean result = number % 2 == 0;
        if (result)
        {
            System.out.println("EVEN");
        }
        else
        {
            System.out.println("ODD");

        }

    }
}
