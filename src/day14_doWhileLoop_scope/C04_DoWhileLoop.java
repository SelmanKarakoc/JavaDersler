package day14_doWhileLoop_scope;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan bir pozitif sayi isteyin,
         sayının tam kare olup olmadığını bulunuz,
         tamkare ise true değilse false yazdırınız.
 Ornek : input : 16, output: 4
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("sayı giriniz: ");
        int girilenSayi= scan.nextInt();
        int i=0;
        boolean sonuc=false;

        do {
            if (i*i==girilenSayi){
                System.out.println("girilen sayının karekoku: "+ i);
                sonuc=true;
                break;
            }else i++;

        }while(i*i<= girilenSayi);

        System.out.println(sonuc);
    }
}
