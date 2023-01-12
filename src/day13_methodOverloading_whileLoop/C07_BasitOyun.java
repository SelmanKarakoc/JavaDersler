package day13_methodOverloading_whileLoop;

import java.util.Random;
import java.util.Scanner;

public class C07_BasitOyun {
    public static void main(String[] args) {

        /*
        random olarak 1 ile 100 arasında bir sayi oluşturun
        kullanıcıdan bu sayıyı bilmesini isteyin
        kullanıcı her değer girdiğinde
        tuttuğumuz sayi ile karşılaştırıp tahminini büyüt veya küçült diyelim
        kullanıcı tuttuğumuz sayıyı bildiğinde
        tahmin sayisini

        -3 veya daha az tahminde bildiyse "wouwww"
        -4-8 tahminde bildiyse "Aferin"
        -daha fazla tahminde bildiyse "Başarısız"
         yazdırın
         */

        Random rnd=new Random();
        int tutulansayi= rnd.nextInt(100);
        Scanner scan=new Scanner(System.in);
        System.out.println("Aklımdan bir sayı tuttum\nHaydi tahmin et:");
        int tahminEdilenSayi=scan.nextInt();

        int tursayisi=1;
        while (tutulansayi!=tahminEdilenSayi){

            System.out.print("Bilemedin tekrar denemelisin:");
            if (tahminEdilenSayi>tutulansayi) System.out.println(" Aşağı ");
            else if (tahminEdilenSayi<tutulansayi) System.out.println(" Yukarı ");

            tahminEdilenSayi=scan.nextInt();
            tursayisi++;

        }
        System.out.println("bildiniz");
        System.out.println("toplam deneme sayısı: "+tursayisi);
        if (tursayisi<=3) System.out.println("Woouuw");
        else if (tursayisi<=8) System.out.println("Aferin");
        else System.out.println("Başarısız");



    }
}
