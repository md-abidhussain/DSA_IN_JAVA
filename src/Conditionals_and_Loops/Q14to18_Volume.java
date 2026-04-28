package Conditionals_and_Loops;

import java.util.Scanner;

public class Q14to18_Volume {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //14 - Volume Of Cone

        /*double radius = in.nextDouble();
        double height = in.nextDouble();
        double volume = 0.33 * 3.14 * radius * radius * height;
        System.out.println("Volume of cone is : " + volume );
         */

        //15- Volume Of Prism

        /*double length = in.nextDouble();
        double base = in.nextDouble();
        double height = in.nextDouble();
        double volume = length * base * height;
        System.out.println("Volume of Prism is : " + volume );*/

        //16- Volume of Sphere

        /*double radius = in.nextDouble();
        double volume = 1.33 * 3.14 * radius * radius * radius;
        System.out.println("Volume of Sphere is : " + volume );*/

        //17 - Volume of cylinder

        /*double radius = in.nextDouble();
        double height = in.nextDouble();
        double volume = 3.14 * radius * radius * height;
        System.out.println("Volume of Cylinder is : " + volume );*/

        //18- Volume of Pyramid

        double Base_Area = in.nextDouble();
        double height = in.nextDouble();
        double volume = 0.33 * 3.14 * Base_Area * height;
        System.out.println("Volume of Pyramid is : " + volume );



    }



}
