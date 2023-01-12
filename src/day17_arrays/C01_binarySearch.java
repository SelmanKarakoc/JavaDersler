package day17_arrays;

import java.util.Arrays;

public class C01_binarySearch {
    public static void main(String[] args) {

        int[] arr={2,8,4,1,9,3,6};

        System.out.println(Arrays.binarySearch(arr, 2));//-5

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 2));//1

        //olmayan bir element aradığımızda ne olur?

        System.out.println(Arrays.binarySearch(arr, 0));//-1
        System.out.println(Arrays.binarySearch(arr,5));//-5



    }
}
