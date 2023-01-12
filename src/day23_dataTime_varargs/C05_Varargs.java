package day23_dataTime_varargs;

public class C05_Varargs {
    public static void main(String[] args) {

        //verilen 2 sayiyi toplayıp yazdıran bir method

        topla(5,8);
        topla(5,7,3);




    }

    private static void topla(int sayi1, int sayi2, int sayi3) {
        System.out.println("Uc sayinin toplamı= "+(sayi1+sayi2+sayi3));

    }

    private static void topla(int sayi1, int sayi2) {
        System.out.println("iki sayının toplamı: "+(sayi1+sayi2));
    }
}
