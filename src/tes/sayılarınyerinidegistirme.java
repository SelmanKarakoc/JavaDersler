package tes;

import java.util.Scanner;

public class sayılarınyerinidegistirme {
    public static void main(String[] args) {
        /*
        - Kullanicidan iki sayi alip
         ikisinin degerlerini degistirin(swap).
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 2 sayi giriniz: ");
        int girilensayi1= scan.nextInt();
        int girilensayi2=scan.nextInt();

        int boskutu;

        boskutu=girilensayi1;
        girilensayi1=girilensayi2;
        girilensayi2=boskutu;

        System.out.println("girdiğiniz sayılarin yerini değiştirdim :)"+girilensayi1+" "+girilensayi2);


    }
}
