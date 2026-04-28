package Conditionals_and_Loops;

import java.util.Scanner;

public class Q8to13_Perimeter {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        //8- Perimeter Of Circle

        /*double radius = sc.nextDouble();
        double perimeter = 2 * 3.14 * radius;
        System.out.println("Perimeter of the circle is: " + perimeter);*/

        //9- Perimeter Of Equilateral Triangle

        /*int side  = sc.nextInt();
        int perimeter = 3 * side;
        System.out.println("Perimeter of the Equilateral Triangle is: " + perimeter);*/

        //10- Perimeter Of Parallelogram

        /*int a = sc.nextInt();
        int b = sc.nextInt();
        int P = 2 * (a + b);
        System.out.println("Perimeter of the Parallelogram+ is: " + P);*/

        //11- Perimeter Of Rectangle

       /* int l = sc.nextInt();
        int w = sc.nextInt();
        int P = 2 * (l + w);
        System.out.println("Perimeter of the Rectangle is: " + P);*/

        //12 & 13 - Perimeter Of Square and Rhombus

        int side = sc.nextInt();
        int P = 4 * side;
        System.out.println("Perimeter of the Square and Rhombus is: " + P);


    }
}
