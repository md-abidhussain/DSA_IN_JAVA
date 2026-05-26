package Array;

public class MaxEle {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 23, 9 , 18, };
        //System.out.println(max(arr));
        System.out.println(maxRange(arr, 1, 3));
    }

    //imagine that arr is not empty
   /* static int max(int[] arr) {
        int maxVal = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }*/

    static int maxRange(int[] arr, int start, int end) {


        //work on edge cases as well

        if (start > end) {
            return -1;
        }
        if (start == end) {
            return 0;
        }

        if (arr == null || arr.length == 0) {
            return -1;
        }


        int maxVal = arr[start];
        for(int i = start; i <= end; i++){
            if(arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    
}
