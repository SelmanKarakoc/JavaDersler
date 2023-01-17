package day35_GenelTekrar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_BolmeIslemSonucunuCarpmaileBulma {
    public static void main(String[] args) {
        //Kullanıcıdan bölünecek sayi ve bölecek sayıyı alıp
        //bölme işlemninin sonucunu çarpma işlemi ile bulan ve yazdıran method
        //bu işlemi kullanıcı q ya basıncaya kadar devam ettirin
        Scanner scan=new Scanner(System.in);
        boolean devamEdelimMi=true;
        int bolunen=1;
        int bolen=1;
        do {

            System.out.println("Lütfen bölme işlemi için iki sayi giriniz: \n" +
                    "bitirmek için Q ya basın");
            try {
                bolunen= scan.nextInt();
                System.out.println("Lütfen bölecek sayiyi giriniz: ");
                bolen=scan.nextInt();
                bolumSonucunuYazdir(bolunen,bolen);

            } catch (InputMismatchException e) {

                String girilenStr=scan.nextLine();

                if (girilenStr.equalsIgnoreCase("q"))
                    devamEdelimMi=false;
                else System.out.println("Bölünecek sayi tamsayi olmalıdır");


            }
            bolen=scan.nextInt();
            int sonuc=0;






        }while (devamEdelimMi);





    }

    private static void bolumSonucunuYazdir(int bolunen, int bolen) {
    //bolunen ve bolen sayi negatif veya pozitif olabilir
    //bu durumda öncelikle işaret kontrolü yapmamız lazım
    //işaret sorununu çözmek için önce işlem sonucunun işaretini belirleyip


        int sonucİsareti=1;
        if (bolunen*bolen<0)
            sonucİsareti=-1;
        //sonra sayilari işaretten bağımsız hale getirelim
        bolunen=bolunen>=0 ? bolunen : bolunen*(-1);
        bolen=bolen>=0 ? bolen : bolen*(-1);

        int bolumsonucu=1;

        while (bolumsonucu*bolen<=bolunen){
            bolumsonucu++;
        }
        bolumsonucu--;
        System.out.println("Bolme işleminin sonucu= "+bolumsonucu*sonucİsareti);

    }
}
