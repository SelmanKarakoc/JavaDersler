package day02_variables_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        //kullanıcıdan bir sayi isteyin
        //ve sayının karesini yazdırın

        Scanner scan= new Scanner(System.in);

        System.out.println("lütfen bir sayi girin:");

        double girilenSayi= scan.nextDouble();
        System.out.println("girdiğiniz sayının karesi="+girilenSayi*girilenSayi);






    }
}
