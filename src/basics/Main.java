package basics;

import java.util.*;

class Main {
    public static void addTwoNumbers(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        addTwoNumbers(a, b);
        scanner.close();
    }
}