package tes;

import java.util.Scanner;

public class sayilarinyerinidegistirme2 {
    public static void main(String[] args) {
        /*
        - Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin
degerlerini degistirin(swap)
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 2 sayi giriniz: ");
        int girilensayi1 = scan.nextInt();
        int girilensayi2 = scan.nextInt();

        girilensayi1=girilensayi1+girilensayi2;
        girilensayi2=girilensayi1-girilensayi2;
        girilensayi1=girilensayi1-girilensayi2;

        System.out.println("sayilarin yerlerini değiştirdim :) "+girilensayi1+" "+girilensayi2);





    }


}
