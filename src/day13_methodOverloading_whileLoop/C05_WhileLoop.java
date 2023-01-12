package day13_methodOverloading_whileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {
   /*
     kullanıcıdan toplamak üzere sayi alın
     girilen sayıların toplamı olur veya geçerse
     "bu kadar sayi yeter" deyip toplamı yazdırın
    */
        //bu soruyu illa da for loop ile yapalım dersek
        //adim sayisini tahmin edip biraz abartabiliriz

        Scanner scan=new Scanner(System.in);
        int toplam=0;
        int sayi=0;

        for (int i = 1; i <10000 ; i++) {
            System.out.println("toplamak üzere tamsayi giriniz");
            sayi=scan.nextInt();

            toplam+=sayi;
            if (toplam>=500)
                System.out.println("bu kadar sayi yeter "+ toplam+" oldu");
            break;


        }

toplam=0;
        sayi=0;

        while (toplam<500){
            System.out.println("toplamak üzere tamsayi giriniz: ");
            sayi=scan.nextInt();

            toplam+=sayi;
        }

        System.out.println("bu kadar sayi yeter.Toplamları "+ toplam+ " oldu");
    }
}
