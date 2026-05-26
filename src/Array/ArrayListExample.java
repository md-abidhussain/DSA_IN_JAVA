package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        //LIST SYNTAX + ADD


        ArrayList<Integer> list = new ArrayList<>();

       /* list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list.contains(4));

        list.set(0, 99);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);*/


        for(int i = 0; i < 5; i++){
            list.add(in.nextInt());
        }

        //get item at any index

        for(int i = 0; i < 5; i++){
            System.out.println(list.get(i)); // pass index here syntax list[index] will not work here
        }








    }
}
