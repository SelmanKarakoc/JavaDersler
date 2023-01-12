package day16_Arrays;

import java.util.Arrays;

public class C13_binarySearch {
    public static void main(String[] args) {
        /*
        binary tree java nın kullandığı özel bir sıralama yontemidir
        binary search method u binaryTree özelliği kullandığından
        sıralı olmayan array lerde doğru sonuc döndürmeyebilir
        eğer binarysearch kullanılacaksa öncesinde mutlaka sort kullanılmalı

         */
        int[] arr={2,6,9,3,15,1,7};

        System.out.println(Arrays.binarySearch(arr, 1));




        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr, 1));


    }
}
