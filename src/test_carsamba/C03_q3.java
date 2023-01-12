package test_carsamba;

import java.util.Scanner;

public class C03_q3 {
    public static void main(String[] args) {
        /*
         *
         * Girilen bir stringdeki a harfi sayısını bulunuz.
         *  ama c harfine gelirse
         * döngüden çıkılsın
         *
         * Bugün hava oldukca güzel.-> 2
         *
         *
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cümle giriniz: ");
        String str= scan.nextLine().toUpperCase();
        int sayac=0;

        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)=='A') sayac++;
            if (str.charAt(i)=='C') break;



        }
        System.out.println(str+"--->"+sayac);


    }
}
