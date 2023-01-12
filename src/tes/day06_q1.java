package tes;

import java.util.Scanner;

public class day06_q1 {
    public static void main(String[] args) {
        /*
        // Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.
        // Bu methodu main methodun disinda olusturup main methodun
        // icinden cagiriniz.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Dönüştürmek istediğiniz birimi giriniz:\n=>Saat\n=>Mil\n=>Kilogram ");
        String birim= scan.nextLine().toLowerCase();

        System.out.print("Dönüştürmek istedğiniz birimin miktarını giriniz: ");
        Double miktar= scan.nextDouble();

        donusturucu(birim,miktar);

        donusturucu("saat",4.0);



    }

    public static void donusturucu(String brm, Double mktr) {

        switch (brm){


            case "saat":
                System.out.println("girilen saatin saniye karşılığı= "+mktr*60*60);
break;

            case "mil":
                System.out.println("girilen mil in km karşılığı= "+mktr*1.6);
break;

            case "kilogram":
                System.out.println("girilen kg in gram cinsinden karşılığı= "+mktr*1000 );
break;
            default:
                System.out.println("Saat-Mil-Kilogram dışında bir değer girdiniz!");



        }



    }


}
