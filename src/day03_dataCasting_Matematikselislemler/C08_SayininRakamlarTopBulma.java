package day03_dataCasting_Matematikselislemler;

import java.util.Scanner;

public class C08_SayininRakamlarTopBulma {
    public static void main(String[] args) {
/* kullanıcıdan 4 basamaklı pozitif bir tamsayi alın
ve sayinin rakamları top bulun
 */

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen 4 basamaklı bir sayi giriniz: ");
        int girilenSayi=scan.nextInt();
        int sayi1,sayi2, sayi3, sayi4;
        sayi1=girilenSayi%10;
        sayi2=girilenSayi/10%10;
        sayi3=girilenSayi/100%10;
        sayi4=girilenSayi/1000%10;
        int top=sayi1+sayi2+sayi3+sayi4;
        System.out.println("sayinin rakamları toplamı= "+top);
    }
}
