package day03_dataCasting_Matematikselislemler;

import java.util.Scanner;

public class C05_soru5 {
    public static void main(String[] args) {
        /* kullanıcıdan bir double, bir tamsayi alın, double sayiyi
        ikinci sayiya bölün ve işlemin sonucununun tam sayi kısmını yazdır

         */
        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir ondalık sayi giriniz: ");
        double girilenDbl=scan.nextDouble();
        System.out.println("Lütfen bir tamsayi giriniz: ");
        int girilenInt=scan.nextInt();

        System.out.println("Çıkan sonuç= "+(int)girilenDbl/girilenInt);





    }
}
