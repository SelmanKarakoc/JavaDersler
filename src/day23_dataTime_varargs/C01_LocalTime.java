package day23_dataTime_varargs;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {

        LocalTime zaman=LocalTime.now();
        System.out.println(zaman);//12:07:37.709227500

        System.out.println(zaman.getMinute());//8

        System.out.println(zaman.withSecond(0).withNano(0));//12:09

        //bir for loop ile 1 den 10.000 e kadar olan sayıları yanyana
        //yazdırın bu işlem için geçen zamanı bulun

        LocalTime baslangicZamani=LocalTime.now();

        System.out.println("başlangıç: "+baslangicZamani);
        for (int i = 1; i <=10000 ; i++) {
            System.out.print(i+" ");


        }
        System.out.println("");
        LocalTime bitisZamani=LocalTime.now();
        System.out.println("bitiş: "+bitisZamani);

        System.out.println("işlem süresi: "+(bitisZamani.getNano()-baslangicZamani.getNano())
        +" nanosaniye");

        /*

         */

    }
}
