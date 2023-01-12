package day21_staticKeyword;

import java.util.Arrays;

public class C06_PassByValueCokluElement {
    public static void main(String[] args) {


        int[] arr={3,6,8};
        //bir method oluşturun
        //method da array e 5 elementli yeni bir array ata ve yazdır
        //main method a dondukten sonra yine array ı yazdırın

        arrayiDegistir(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void arrayiDegistir(int [] a){


        a=new int[5];
        System.out.println(Arrays.toString(a));
    }
}
