package basics;

public class  TypeCasting {
    public static void main(String[] args) {
        //type casting
//        int num = (int) (67.56f);
//        System.out.println(num);

//        //automatic type promotion in expression
//        int a = 257;
//        byte b = (byte)(a); // 257 % 256 == 1
//        System.out.println(b);
//
//        byte c = 40;
//        byte d = 50;
//        byte e = 100;
//        int f = c * d / e;
//        System.out.println(f);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.56f;
        double d = 0.1234;
        double result = (f * b) + (i / c) * (d * s);
        // float + int * double = double
        System.out.println((f * b) + " " + (i/c) + " " + (d * s));
        System.out.println(result);


    }
}
