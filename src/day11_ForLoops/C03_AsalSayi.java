package day11_ForLoops;

public class C03_AsalSayi {
    public static void main(String[] args) {
        /*
        input olarak verilen bir tamsayının asal sayı olup olmadığını yazdır

         */

        int input=23;
        String sonuc="Sayi asal";

        for (int i = 2; i <input ; i++) {

            if (input%i==0) sonuc="Sayi asal değil";
            break;
//Java bir loop un içerisinde break görürse o loop u bitirir

        }
        System.out.println(sonuc);





















    }
}
