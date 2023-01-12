package day16_Arrays;

import java.util.Arrays;

public class C04_Soru {
    public static void main(String[] args) {
        /*
        verilen bir String array de
        istenen bir harfi içeren kelimeleri silip
        yerine null yazdırın
         */

        String[] isimler={"Huseyin","Yusuf","Selman","Akile","Said"};
        String silinecekHarf="u";

        for (int i = 0; i < isimler.length; i++) {

            if (isimler[i].contains(silinecekHarf)){
                isimler[i]=null;
            }

        }

        System.out.println(Arrays.toString(isimler));


    }
}
