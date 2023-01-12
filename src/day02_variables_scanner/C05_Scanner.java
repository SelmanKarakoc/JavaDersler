package day02_variables_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        /* kullanıcıdan ismini alın
        ve girilen ismi büyük harflerle yazdırın
        kullanıcıdan değer almak için 3 işlem lazım
        1.adım scanner objesi oluşturmak

         */
        Scanner scan=new Scanner(System.in);

        //2.adım kulllanıcıya ne istidiğini söyleyin

        System.out.println("İsminizi yazın");

        //3.adım kullanıcının gireceği değeri kaydedeceğiniz bir variable olmalı
        //scan objesi ile ilgili methodu kullanarak kullanıcının girdiği değeri
        //oluşturduğunuz var
        String girilenİsim= scan.nextLine();
        //Artık kullanıcının girdiği değer girilenİsim variable'inda kayıtlı


        System.out.println(girilenİsim.toUpperCase());




    }



}
