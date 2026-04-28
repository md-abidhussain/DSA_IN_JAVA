package Conditionals_and_Loops;

public class if_else {
    public static void main (String[] args) {
        /* syntax of if statement
          if (boolean result) {
            body
        } else {
            do this
         }
         */

        int salary = 28500 ;

//        if (salary > 10000) {
//            salary = salary + 2000;
//        } else {
//            salary = salary + 1000;
//        }

        /*
        multiple if else
         */

        if (salary > 10000) {
            salary += 1000;
        } else if (salary > 20000) {
            salary += 3000;
        } else {
            salary += 500;
        }
        System.out.println(salary);
    }
}
