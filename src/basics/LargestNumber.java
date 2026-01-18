package basics;

import java.util.*;

public class LargestNumber {
    public static void main (String [] args){
        Scanner num1 = new Scanner(System.in);
        System.out.print("Enter 1st Number");
        int number1 = num1.nextInt();

        Scanner num2 = new Scanner(System.in);
        System.out.print("Enter 2nd Number");
        int number2 = num2.nextInt();

        boolean result = (number1 > number2);

        if (result){
            System.out.println("Largest_Number is: " + number1);
        }
        else{
            System.out.println("Largest_Number is: "+ number2);
        }

    }
}
