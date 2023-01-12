package tes;

import java.util.Scanner;

public class day02_Q1 {
    public static void main(String[] args) {

        //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi 0 dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int sayi= scan.nextInt();

        System.out.println("**************if çözümü***********");

        if (sayi>=0){
            if (sayi<10) System.out.println("Rakam");
            else System.out.println("Pozitif sayı");
        } else {
            System.out.println("negatif sayi");

        }


        System.out.println("**************ternary çözümü***********");
        System.out.println(sayi>=0 ? sayi<10 ? "rakam" : "pozitif sayi" : "negatif sayi");


    }
}
