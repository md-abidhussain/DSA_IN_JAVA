package Conditionals_and_Loops;

import java.util.Scanner;

public class Q1to7_AREA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //1-Area of circle

//        float radius = in.nextFloat();
//        double Area = 3.14 * radius * radius;
//        System.out.println("Area of circle is " + Area);

        //2-Area of Triangle

        /* float base = in.nextFloat();
        float height = in.nextFloat();
        double Area = 0.5 * base * height;
        System.out.println("Area of Triangle is " + Area);*/

        //3- Area of Rectangle

        /*int length = in.nextInt();
        int width = in.nextInt();
        int Area = length * width;
        System.out.println("Area of Rectangle is " + Area);*/

        //4-Area Of Isosceles Triangle

        /*double a = in.nextDouble();
         double b = in.nextDouble();
         double area = (b/4) * Math.sqrt(4 * a * a - b * b);
         System.out.println("Area of Isosceles Triangle is " + area);*/

        //5-Area Of Parallelogram

        /*
        int base = in.nextInt();
        int height = in.nextInt();
        int area = base * height;
        System.out.println("Area of Parallelogram is " + area);
        */

        //6-Area Of Rhombus

        /*
        double d1 = in.nextDouble();
        double d2 = in.nextDouble();
        double area = 0.5 * d1 * d2;
        System.out.println("Area of Rhombus is " + area);
        */

        //7- Area of Equilateral Triangle

        double a = in.nextDouble();
        double area = Math.sqrt(3)/4 * a * a;
        System.out.println("Area of Equilateral Triangle is " + area);


    }
}


