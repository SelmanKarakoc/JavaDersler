package day02_variables_scanner;

public class C03_NonPrimitiveDataTypes {
    public static void main(String[] args) {
        String str="Java candir";
        int sayi=10;

        /*primitive data tülerinin hazir methotları yoktur
        ancak non-primitive data türlerinin önceden hazırlanmış,
        bizim kullanabileceğimiz methotları olur.
         */

        System.out.println(sayi);

        System.out.println(str.toLowerCase());
        System.out.println(str);
        System.out.println(str.toUpperCase());

        System.out.println(str.isEmpty());

    }
}
