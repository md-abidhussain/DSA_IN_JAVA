package Conditionals_and_Loops;

public class Count_Occurence {
    public static void main(String[] args) {
        int n = 13839;
        int count = 0;

        while (n > 0) {
            int mod = n % 10;
            if (mod == 3) {
              count ++;
            }
            n = n / 10;
        }
        System.out.println("count of 3 is: " + count);
    }
}
