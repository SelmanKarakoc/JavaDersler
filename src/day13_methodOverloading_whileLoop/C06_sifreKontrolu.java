package day13_methodOverloading_whileLoop;

import java.util.Scanner;

public class C06_sifreKontrolu {
    public static void main(String[] args) {
        /*
        Soru 4 : Kullanicidan bir sifre isteyip,
         asagidaki sartlari kontrol edin ve
          kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
           eger tum sartlari saglarsa, “sifre basariyla kaydedildi” yazdirin
  - ilk harf kucuk harf olmali
  - son karakter rakam olmali
  - sifre bosluk icermemeli
  - uzunlugu en az 10 karakter olmali
         */
        //sifre kontrolünü bir methotta yapıp true/false dondurun
        //main methotta dönen sonucu kontrol edip
        //"başarı ile oluşturuldu yazıncaya kadar tekrar tekrar isteyin

        Scanner scan = new Scanner(System.in);

        boolean tekrarSifreIste = true;
        String sifre = "";

        while (tekrarSifreIste) {
            System.out.println("Lütfen şifreyi giriniz: ");
            sifre = scan.nextLine();

            if (sifreKontrolEt(sifre)) { //sifre kontrolü true dönerse sifre başarılı demektir
                System.out.println("başarı ile oluşturuldu");
                //break;
                tekrarSifreIste = false; //break; te olur bu da

            }


        }
    }

        public static boolean sifreKontrolEt (String sifre){

            int flag = 0;

            //- ilk harf kucuk harf olmali
            if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')) {//ilk harf kucuk değilse hatayı yazdır
                System.out.println("ilk harf kucuk olmalı");
                flag++;
            }

            // - son karakter rakam olmali
            if (!(sifre.charAt(sifre.length() - 1) >= '0' && sifre.charAt(sifre.length() - 1) <= '9')) {
                System.out.println("son karakter rakam olmalı");
                flag++;

            }
            //      - sifre bosluk icermemeli

            if (sifre.contains(" ")) {
                System.out.println("sifre boşluk içermemeli");
                flag++;
            }
            //  - uzunlugu en az 10 karakter olmali
            if (!(sifre.length() >= 10)) {
                System.out.println("sifrenin uzunluğu en az 10 karakter olmalı");
                flag++;
            }

            if (flag == 0) {
                return true;
            } else return false;

        }

}
