package day07_ternary_switchStatements;

import java.util.Scanner;

public class C01_IfElseIf {
    public static void main(String[] args) {
        /* kullanıcıdan bir tam sayı al
        sayı rakam ise "girilen sayı rakam"
        sayı 2 basamaklı ise "girilen sayı 2 basamaklı"
        sayı 2 basamaktan buyuk ise "buyuk sayı" yazdır
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int girilenSayi= scan.nextInt();

        if (0<=girilenSayi && girilenSayi<=9) System.out.println("girilen sayı rakam");
        else if (10<=girilenSayi && girilenSayi<=99) System.out.println("girilen sayı iki basamaklı");
        else if (girilenSayi>=100) System.out.println("büyük sayı");







    }
}
