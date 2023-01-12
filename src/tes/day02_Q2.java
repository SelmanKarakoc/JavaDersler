package tes;

import java.util.Scanner;

public class day02_Q2 {
    public static void main(String[] args) {
        /*
         * Kullanicidan iki tamsayi sayi ve islem cinsini alin
         * ve sayilari kullanicinin belirledigi isleme tabii tutup sonucu yazdirin.
         *
         * islem cinsi icin 1:toplama 2:cikarma 3:carpma 4: bolme
         *
         * Ornek : Inputs : sayilar : 18 , 10  islem : 3
         *         Output : 18 X 10 = 180
         *
         *
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen işlem yapmak istediğiniz iki sayı giriniz: ");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        System.out.println("yapmak istedğiniz işlem: ");
        char islem=scan.next().charAt(0);


        switch (islem){
            case '+':
                System.out.println("toplama işleminin sonucu= "+ (sayi1+sayi2));
                break;
            case '-':
                System.out.println("çıkarma işleminin sonucu= "+ (sayi1-sayi2));
                break;
            case '*':
                System.out.println("çarpma işleminin sonucu= "+ (sayi1*sayi2));
                break;
            case '/':
                System.out.println("bölme işleminin sonucu= "+ (sayi1/sayi2));
                break;
            default:
                System.out.println("yanlış işlem tercihi");
        }

















    }
}
