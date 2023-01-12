package day16_Arrays;

import java.util.Arrays;

public class C12_sort {
    public static void main(String[] args) {
        /*
        verilen bir array i natural order a gore sıralayıp yazdır
         */
        String[] isimler={"Huseyin","Yusuf","Selman","Akile","Said","Hasan","ahmet"};

        System.out.println(Arrays.toString(isimler));

        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));





    }
}
