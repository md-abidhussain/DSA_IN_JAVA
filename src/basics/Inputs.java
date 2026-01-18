package basics;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rollNo = input.nextInt();
        System.out.println("Your roll number is " + rollNo);

        Scanner inputs = new Scanner(System.in);
        String name = inputs.nextLine();
        System.out.println(name);

        Scanner inputed = new Scanner(System.in);
        float marks = inputed.nextFloat();
        System.out.println(marks);
    }
}
