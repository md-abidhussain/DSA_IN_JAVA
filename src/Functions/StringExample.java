package Functions;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String Message = Greet();
//        System.out.println(Message);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name");
        String name = in.next();
        String Personalised = MyGreet(name);
        System.out.println(Personalised);
    }

    static String MyGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    static String Greet(){
        String greeting = "How are you";
        return greeting;
    }
}
