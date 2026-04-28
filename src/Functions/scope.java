package Functions;

public class scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Abid";
        {
            // int a = 78; // Already initialised outside the block in the same method.
            a = 79; //Reassign the origin ref variable to some other value.
            System.out.println(a);
            int c = 99;
            name = "Rahul";
            System.out.println(name); // values initialised in this block will remain in block. #Block scope.
        }

        int c = 999;
        System.out.println(a);
        System.out.println(name);
        //System.out.println(c); cannot use outside the block.

        //Scoping in for loop

        for (int i = 0; i <= 5; i++) {
            //System.out.println(i);

            int num = 1000;
            a = 100000;
        }

        System.out.println(a);

    }

        static void random(int marks){
        int num = 67;
            System.out.println(num);
            System.out.println(marks);

    }
}
