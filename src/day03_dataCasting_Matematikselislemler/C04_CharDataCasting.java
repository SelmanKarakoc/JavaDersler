package day03_dataCasting_Matematikselislemler;

import java.util.Scanner;

public class C04_CharDataCasting {
    public static void main(String[] args) {
        /* char data türünün ekstra bir özelliği vardır
        eğer matematiksel bir işlemde char data türünden bir değer kullanırsanız

         */
        System.out.println('a'+'b');// (ascii table) 97+98

        System.out.println('a'-32);// 97-32

        //'a'-32 nin değerini char olarak yazdır

        System.out.println((char) ('a'-32)); // A
       /* kullanıcıdan bir char alıp
       ascii table dan kullanıcının girdiği char ın sonrasındaki
       3 karekteri yazdırın
       örnek input=a output=b,c,d
        */

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir harf girin: ");
        char girilenHarf=scan.next().charAt(0);
        System.out.print((char) (girilenHarf+1)+ ",");
        System.out.print((char) (girilenHarf+2)+",");
        System.out.println((char) (girilenHarf+3));



    }
}
