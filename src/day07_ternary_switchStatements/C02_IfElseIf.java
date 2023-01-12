package day07_ternary_switchStatements;

import java.util.Scanner;

public class C02_IfElseIf {
    public static void main(String[] args) {
        /* kullanıcıdan bir tam sayı al
        sayi negatif ise "negatif sayi"
        sayı rakam ise "girilen sayı rakam"
        sayı 2 basamaklı ise "girilen sayı 2 basamaklı"
        sayı 2 basamaktan buyuk ise "buyuk sayı" yazdır


         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int girilenSayi= scan.nextInt();

        if (girilenSayi<0) System.out.println("negatif sayi");
        else if (girilenSayi<=9) System.out.println("girilen sayi rakam");
        else if (girilenSayi<=99) System.out.println("girilen sayi 2 basamaklı");
        else System.out.println("büyük sayi");


        }

    }
