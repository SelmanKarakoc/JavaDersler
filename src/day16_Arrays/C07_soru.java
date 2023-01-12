package day16_Arrays;

public class C07_soru {
    public static void main(String[] args) {
        /*
        Verilen bir array’de istenen bir elemanin var olup olmadigini
        ve varsa kac kere kullanildigini yazdiran
        bir method olusturun.
         */
        int[] arr={2,3,4,2,5,2,6,7,4,5,1,2,4,6,3,1,9};
        int aranansayi=2;

        elemanBul(arr,aranansayi);

        elemanBul(arr,8);

    }
    public static void elemanBul(int []arr, int aranansayi){
        int sayac=0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]==aranansayi) sayac++;

        }
        if (sayac==0) System.out.println("Aranan sayı array de yok");
        else System.out.println("Aradıgınız "+aranansayi+"array de "+sayac+" adet kullanılmıştır");

    }

}
