package day02_variables_scanner;

import java.util.Scanner;

public class C09_Scanner {
    public static void main(String[] args) {
        /* Soru 7 (Interview)- Kullanicidan iki sayi alip
        ikisinin degerlerini degistirin(swap).

          kullanıcının girdiği değerler
          sayi1=10 sayi2=20 ise sen onu
          sayi1=20 sayi2=10 yap
         */
        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen sayi1 i giriniz: ");
        int sayi1= scan.nextInt();
        System.out.println("Lütfen sayi2 i giriniz: ");
        int sayi2= scan.nextInt();

        int temp;
        //1.adım sayi2 değerini tempe at
        temp=sayi2;
        //2.adım sayi1 değerini sayi2 ye at
        sayi2=sayi1;
        //temp deki değeri sayi1 e ata
        sayi1=temp;

        System.out.println("sayilarin yerini değiştirdim" +
                           "\nsayi1 in yeni değeri : "+sayi1 +
                           "\nsayi2 nin yeni değeri : "+sayi2 );





    }
}
