package day03_dataCasting_Matematikselislemler;

import java.util.Scanner;

public class C04_DataCasting_deneme {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int sayi1;
        int sayi2;
        double dbl1;
        double dbl2;

        System.out.println("Lütfen bir tam sayi giriniz: ");

        sayi1= scan.nextInt();
        dbl1=sayi1;

        System.out.println("Lütfen bir tam sayi giriniz: ");

        sayi2= scan.nextInt();
        dbl2=sayi2;




        System.out.println("sonuc= "+ dbl1/dbl2);

    }
}
