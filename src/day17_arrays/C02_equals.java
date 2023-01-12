package day17_arrays;

import java.util.Arrays;

public class C02_equals {
    public static void main(String[] args) {


        int [] arr1={3,8,0};
        int [] arr2={8,3,0};

        System.out.println(Arrays.equals(arr1, arr2));//false
        /*
        equals method u hem elementleri hem de index i kontrol eder

         */

        Arrays.sort(arr1); //{0,3,8}
        Arrays.sort(arr2); //{0,3,8}
        System.out.println(Arrays.equals(arr1, arr2));//true

    }
}
