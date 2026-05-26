package Array;

public class Syntax_Arr {
    public static void main(String[] args) {

/*        //Syntax
        datatype[]  variable name = new datatype[size];
        */

        //store 5 roll no
        /*int[] rn = new int[5];
        OR directly
        int[] rn = {28 , 5 , 38 , 24, 146};*/


        int[] ros; // declaration of array of ros if defined in the stack.
        ros = new int[5]; // initialization: actually object is being created in the heap memory.

        System.out.println(ros[0]);

        String[] name = new String[4];
        System.out.println(name[0]);

        //PRINT WILL RETURN NULL SAME AS NONE IN PYTHON

    }
}
