package day12_methodCreation;

import java.util.Scanner;

public class C05_HesapMakinesiMethod {
    public static void main(String[] args) {

        //kullanıcıdan iki sayi ve istediği işlemi alın
        //bir method oluşturup sayılara istenen işlemi uygulayıp
        //sonucu bize dondurun
        //kullanıcı islemi yanlış seçtiyse 0 döndür

        Scanner scan=new Scanner(System.in);
        System.out.println("işlem yapmak istediğiniz iki sayı ve bir işlem giriniz:");
        double girilensayi1, girilensayi2;
        char islem;
        girilensayi1=scan.nextDouble();
        girilensayi2=scan.nextDouble();
        islem=scan.next().charAt(0);

        System.out.println(hesapMakinasi(girilensayi1, girilensayi2, islem));



    }
      public static double hesapMakinasi(double sayi1,double sayi2,char islem){


        switch (islem){
            case '+':
                return sayi1+sayi2;

            case '-':
                return sayi1-sayi2;

            case '*':
                return sayi1*sayi2;

            case '/':
                return sayi1/sayi2;

            default: return 0;

        }



      }

}
