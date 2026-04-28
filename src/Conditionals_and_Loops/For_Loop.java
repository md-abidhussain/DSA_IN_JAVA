package Conditionals_and_Loops;

import java.util.Scanner;

public class For_Loop {
    public static void main(String[] args) {
        /*
        Syntax for loops

        for (initialisation ; condition; increment/decrement) {
            //body
        }
         */

        //print number from 1 to 5

//        for(int num =1; num <=5 ; num +=1){
//            System.out.println(num);
//        }

       Scanner input = new Scanner(System.in);
          int n = input.nextInt();

          for (int num = 1; num <= n; num++) {
              System.out.print(num + " ");
          }

    }
}


// Use for loop when you know how many times the loop will run.
