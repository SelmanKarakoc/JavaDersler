package day06_if_else_Statements;

import java.util.Scanner;

public class C11_NestedIfElse {
    public static void main(String[] args) {
        /* Kullanicidan aldigi urun adedi ve liste fiyatini alin,
         kullaniciya musteri karti olup olmadigini sorun.
          Musteri karti varsa 10 urunden fazla alirsa %20,
          yoksa %15 indirim yapin,
          Musteri karti yoksa 10 urunden fazla alirsa %15,
           yoksa %10 indirim yapin

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Kaç ürün aldığınızı lütfen giriniz: ");
        int adet= scan.nextInt();
        System.out.println("Liste fiyatınızı giriniz: ");
        double fiyat= scan.nextDouble();
        System.out.println("Müşteri Kartınız varsa E yoksa H yazınız: ");
        char kart=scan.next().charAt(0);

        //ürün miktarı ana değişken

        if (adet>=10){
            if (kart=='E'|| kart=='e')System.out.println("Ödeyeceğiniz toplam tutar= "+ adet*fiyat*80*100);
            else if (kart=='H' || kart=='h') {System.out.println("Ödeyeceğiniz toplam tutar= "+ adet*fiyat*85*100);

            }


        } else if (adet>0) {
            if (kart=='E'|| kart=='e')System.out.println("Ödeyeceğiniz toplam tutar= "+ adet*fiyat*85*100);
            else if (kart=='H' || kart=='h') {System.out.println("Ödeyeceğiniz toplam tutar= "+ adet*fiyat*90*100);



            }else System.out.println("hatalı ürün adeti");


    }
    }
}
