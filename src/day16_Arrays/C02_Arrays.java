package day16_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        /*
        verilen bir String array in tüm elementlerini yazdırın
         */

        String[] isimler={"Huseyin","Yusuf","Selman","Akile","Said"};

        System.out.println(Arrays.toString(isimler));

        for (int i = 0; i < isimler.length; i++) {

            System.out.print(isimler[i]+" ");

        }


    }
}
