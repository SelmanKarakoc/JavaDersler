package day06_if_else_Statements;

import java.util.Scanner;

public class C07_IfElseIf {
    public static void main(String[] args) {
        /*
        Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        vucut kitle endeksi 30’dan buyukse obez,
         25-30 arasi ise kilolu,
         20-25 arasi ise normal,
         20’den kucukse zayif yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen kilo(kg) ve boyunuzu(cm) giriniz: ");
        double kilo= scan.nextDouble();
        double boy= scan.nextDouble();
        double vke=(kilo*10000)/(boy*boy);
        System.out.println("Vücut kitle endeksi: "+ vke);

        if (vke>=30) System.out.println("Obez");
        else if (vke>=25) {
            System.out.println("Kilolu");

        } else if (vke>=20) {
            System.out.println("Normal");


        }else System.out.println("Zayıf");


    }
}
