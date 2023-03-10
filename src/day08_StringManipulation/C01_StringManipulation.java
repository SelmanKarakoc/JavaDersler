package day08_StringManipulation;

import java.util.Scanner;

public class C01_StringManipulation {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan gunu ismini girmesini isteyin,
        // girilen gun hafta ici bir gun ise “Simdi calisma zamani tatile .. gun var” seklinde
        // hafta sonu tatiline kac gun kaldigini yazdirin, girilen gun
        // hafta sonu ise “Simdi dinlenme zamani” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen gün ismi giriniz: ");
        String girilenGun=scan.next();
        String kullanılacakGun=girilenGun.toLowerCase();

        /*
        string ifadeler case sensitive dir.
        kullanıcının Pazar, PAzar,...gibi çok farklı şekilde yazma ihtimali var

         */

        switch (kullanılacakGun){
            case "pazartesi":
                System.out.println(girilenGun+" çalışma zamanı, tatile 5 gün var.");
                break;
            case "salı":
                System.out.println(girilenGun+" çalışma zamanı, tatile 4 gün var.");
                break;
            case "çarşamba":
                System.out.println(girilenGun+" çalışma zamanı, tatile 3 gün var.");
                break;
            case "perşembe":
                System.out.println(girilenGun+" çalışma zamanı, tatile 2 gün var.");
                break;
            case "cuma":
                System.out.println(girilenGun+" çalışma zamanı, tatile 1 gün var.");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("şimdi dinlenme zamanı ");
                break;
            default:
                System.out.println("yanlış gün");
        }




    }
}
