package day13_methodOverloading_whileLoop;

import day12_methodCreation.C03_AsalSayiMethod;
import day12_methodCreation.C07_TerseCevirme;
import day12_methodCreation.C09_FibonacciSerisi;

public class C01_MethodCall {
    public static void main(String[] args) {
//ilk 15 fibonacci sayisini yazdirin

        C09_FibonacciSerisi.fibonacciSayiYazdir(15);

//aşağıda verilen cumleyi tersine çevirin

       String str="Bir kere yaparım, yan gelir yatarım";
        String tersStr=C07_TerseCevirme.metniTerseCevir(str);
        System.out.println(tersStr);

//aşağıda verilen cümlenin palidrome olup olmadığını yazdır

       str="Java candir";

       tersStr=C07_TerseCevirme.metniTerseCevir(str);

       if (str.equals(tersStr)){
           System.out.println("girilen cümle palindrome dur");
       }else System.out.println("girilen cümle palindrome değil");

//asagıda verilen sayinin asal sayi olup olmadığını yazdır

        int sayi=23;

        System.out.println(C03_AsalSayiMethod.asalsayiMi(sayi));

        //kullanıcı true/false dan bir şey anlamaz açık şekilde yazalım

        boolean sonuc=C03_AsalSayiMethod.asalsayiMi(sayi);

        if (sonuc==true){
            System.out.println("Girilen " +sayi+ " asal sayidir");
        }else System.out.println("Girilen " +sayi+ " asal sayi değildir");


    }
}
