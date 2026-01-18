package basics;

import java.util.Scanner;

public class Input_Greeting {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name: ");

        String name = input.nextLine();
        System.out.println("Hello " + name);
    }
}
