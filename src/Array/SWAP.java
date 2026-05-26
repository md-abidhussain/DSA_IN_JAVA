package Array;

import java.util.Arrays;

public class SWAP {
    public static void main(String[] args) {
        int [] arr = {1 , 3 , 2 , 18 ,21};
        //swap(arr, 1,3);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }


    //Reverse element of array

    static void reverse(int [] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end ) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }



    static void swap(int [] arr, int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;


    }













}
