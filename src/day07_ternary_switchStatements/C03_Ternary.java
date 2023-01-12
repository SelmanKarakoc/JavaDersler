package day07_ternary_switchStatements;

public class C03_Ternary {
    public static void main(String[] args) {

        //input olarak verilen sayiyi kontrol edip
        //sayi çift ise "çift sayi"
        //değilse "tek sayi" yazdırın

        int input=44;

        //if else ile yapalım
        if (input%2==0) System.out.println("çift sayi");
        else System.out.println("tek sayi");

        // ternary ile yapalım

        System.out.println(input%2==0 ? "çift sayi" : "tek sayi");





    }
}
