package basics;

import java.util.Scanner;

public class InrtoDollar {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Amount in INR: ");
        float numRS = input.nextInt();
        float dollar = numRS / 90;
        System.out.println("INR in Dollar is: " + dollar);


    }
}
