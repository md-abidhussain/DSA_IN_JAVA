package Switch;

import java.util.Scanner;

public class Switch_statements {
    public static void main(String [] args) {
        /*
        //syntax

        switch (expression) {
            //cases
            case one:
            //do something;
            break;

            case two:
            //do something;
            break;

    A        default:
            //do something
            }
         */
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
                case "Mango":
                    System.out.println("King of fruits");
                    break;
                case "Apple":
                    System.out.println("A sweet red fruits");
                    break;
                case "Orange":
                    System.out.println("Provides Vitamin C");
                    break;
            case "Grapes":
                    System.out.println("Green Fruit");
                    break;
            default:
                System.out.println("Please Enter a Valid Fruit");
        }

    }
}
