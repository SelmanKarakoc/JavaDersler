package day08_StringManipulation;

import java.util.Random;

public class C06_length {
    public static void main(String[] args) {

        String str="Java her geçen gün daha da güzelleşiyor, değil mi?";

        //sondan 3. karakteri yazdırın
        System.out.println(str.toUpperCase().charAt(str.length()-3));
        System.out.println(str.length());

        // rastgele bir karakterini yazdıralım

        Random rnd=new Random();// rnd değeri için 0 ile 1 arasında rastgele bir değer oluşturur
        int index= rnd.nextInt(str.length());//str.length ten kucuk rastgele bir int üretir

        System.out.println(str.charAt(index));










    }
}
