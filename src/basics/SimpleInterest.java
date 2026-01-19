package basics;

import java.util.*;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter P: ");
        int P = input.nextInt();

        System.out.print("Enter R: ");
        int R = input.nextInt();

        System.out.print("Enter T: ");
        int T = input.nextInt();


        int SI = (P * R * T) / 100;

        System.out.println("Simple Interest is " + SI);
    }
}
