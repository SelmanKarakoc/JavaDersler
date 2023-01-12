package day08_StringManipulation;

public class C07_substring {
    public static void main(String[] args) {

        String str="Java öğren, işi kap";

        System.out.println(str.length());//karakter sayısı : 19

        //metnin tam ortasındaki karakter nedir?

        System.out.println(str.charAt(str.length()/2)); // n

        //son karakteri yazdır

        System.out.println(str.charAt(str.length()-1)); //p

        //bir karakteri değil de verilen String in içerdiği bir metin parçasını elde etmek istersek
        //örneğin "öğren" kelimesini yazdıralım

        System.out.println(str.substring(5, 9));
//substring (baş, bitiş) methodunda başlangıç dahildir
        //bitiş dahil değildir, [5,9) olur
        System.out.println(str.substring(5, 10));

        //str den "Java" kelimesini yazdıralım

        System.out.println(str.substring(0,4));

        //str den "kap" yazdıralım

        System.out.println(str.substring(16,19));

        System.out.println(str.substring(16));

        System.out.println(str.substring(str.length()-3));

        //substring kullanarak j harfini yazdır

        System.out.println(str.substring(0,1));

        //substring kullanarak 9.indexteki harfi buyuk olarak yazdır

        System.out.println(str.substring(9,10).toUpperCase());
        System.out.println(str.toUpperCase().charAt(9));

        //charAt() kullanmak yerine substring kullanmak daha avantajlı olabilir
        //çünkü sub kullanınca ifade hala string olduğundan
        //method kullanmaya devam edilebilir

        System.out.println(str.substring(5,5));// hiçlik yazdırır
        System.out.println("========");

        //System.out.println(str.substring(4,3)); hata
        //System.out.println(str.substring(25,28)); hata

        System.out.println(str.substring(str.length()));//boş satır
        //System.out.println(str.charAt(str.length())); hata

        System.out.println("========");




    }
}
