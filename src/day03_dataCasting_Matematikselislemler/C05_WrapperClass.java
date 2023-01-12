package day03_dataCasting_Matematikselislemler;

public class C05_WrapperClass {
    public static void main(String[] args) {
        int sayi=10;
        String str="Java Candir";
        /* int primitive olduğundan hazir methotları yoktur
        String non-primitive olduğundan hazir methotlari vardır

        int, char, boolean gibiler için methot hazirlanmış ve
        Java Integer, Character, Boolean gibi wrapper classlar oluşturmuştur.

         */
        Integer sayi2=20;
        /* işlemlerimizi yaparken bazen String olarak tanımlanmış
        ancak matematiksel içerik bulunduran variable lar ile karşılaşabiliriz
        Bu durumda bu tür Stirng variable lari sayiya çevirme ihtiyacımız olabilir
EĞer sayiya çevirmek istediğimiz metinlerde harf veya sayi olmayan
başka karakter varsa Java hata verir

         */
        String str2="123";
        String str3="354";

        int str2Int=Integer.parseInt(str2); // 123
        int str3Int=Integer.parseInt(str3); // 354
        System.out.println(str2Int+str3Int); // 477

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        char krk1='$';
        System.out.println(Character.isDigit(krk1));
        System.out.println(Character.isLetter(krk1));
        System.out.println(Character.isAlphabetic(krk1));



        short sayi3=4;
        int sayi5=sayi3;
        // wrapper class larda casting olmaz
        //Short sayi6=45;
        //Integer sayi7=(Integer)sayi6;



    }
}
