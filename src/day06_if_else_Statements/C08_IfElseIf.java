package day06_if_else_Statements;

import java.util.Scanner;

public class C08_IfElseIf {
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
        if (kart=='E' && adet>=10){
            System.out.println("Ödeyeceğiniz fiyat= " + adet*fiyat*80/100);
        }else if(kart=='E' &&adet<10) {
            System.out.println("Ödeyeceğiniz fiyat= " + adet*fiyat*85/100);
        } else if (kart=='H'&& adet>=10 ) {
            System.out.println("Ödeyeceğiniz fiyat= " + adet*fiyat*85/100);
        }else if(kart=='H'&&adet<10) {
            System.out.println("Ödeyeceğiniz fiyat= " + adet*fiyat*90/100);



        }else System.out.println("hatalı bilgi");
}
}
