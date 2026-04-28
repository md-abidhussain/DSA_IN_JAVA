package Switch;

import java.util.Scanner;

public class Enhaced_Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A sweet red fruits");
            case "Orange" -> System.out.println("Provides Vitamin C");
            case "Grapes" -> System.out.println("Green Fruit");
            default -> System.out.println("Please Enter a Valid Fruit");
        }

    }
}
