package test_carsamba;

import java.util.Scanner;

public class C04_q4 {
    public static void main(String[] args) {
        /*
        Bir sayinin mükemmel olup olmadiğini bulan bir method yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)

 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen mükemmel olup olmadığını merak ettiğiniz sayıyı giriniz: ");
        int girilenSayi = scan.nextInt();

        if (mukemmelsayi(girilenSayi)) System.out.println("Mükemmel sayi");
        else System.out.println("Mükemmel sayi değildir");


    }

    public static boolean mukemmelsayi(int sayi) {
        int toplam = 0;
        for (int i = 1; i < sayi; i++) {

            if (sayi % i == 0) toplam += i;
        }
        if (toplam == sayi) return true;
        else return false;
    }
}

