package day11_ForLoops;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
         Bitis degeri baslangic degerinden kucukse,
         uyari yazdirip islemi sonlandirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen baslangıç değeri girin: ");
        int baslangic=scan.nextInt();
        System.out.println("Lütfen bitis değeri girin: ");
        int bitis=scan.nextInt();

        int toplam=0;

        if (bitis<baslangic){
            System.out.println("başlangıç değeri bitiş değerinden küçük olmalı");

        }else {
            for (int i = baslangic; i <=bitis ; i++) {
                toplam+=i;


            }
        }



        System.out.println(toplam);













    }
}
