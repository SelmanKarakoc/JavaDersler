package day07_ternary_switchStatements;

public class C04_Ternary {
    public static void main(String[] args) {

        /*Kullanıcıdan alınan değer
        100 den buyukse sayıyı 2 ile çarpın
        100 den eşit veya kucuk ise sayıya 10 ekleyin
         */

        int input=145;

        //if else ile

        if (input>100) System.out.println(input*2);
        else System.out.println(input+10);

        //ternary
        System.out.println(input > 100 ? input * 2 : input + 10);
        //input=input > 100 ? input * 2 : input + 10
/*
verilen input u inceleyin
eğer 100 den buyukse bunu 5 e bölüp
bolum sonucunun tek sayi olup olmadığını kontrol edin
eğer 100 den buyuk değilse
10 ile bölümünden kalanı bulup bu kalanı 5 artırın


bu tür kompleks işlemleri TERNARY ile YAPMAYIZ!!!
 */




    }
}
