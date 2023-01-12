package day06_if_else_Statements;

import java.util.Scanner;

public class C02_IfElseStatements {
    public static void main(String[] args) {
         /*Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen ikizkenar ise
         “ikizkenar ucgen” yazdirin, degilse “ikizkenar degil” yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenarlarını giriniz: ");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if((kenar1==kenar2 && kenar1!=kenar3) ||
                (kenar2==kenar3 && kenar2!=kenar1) ||
                (kenar3==kenar1 && kenar3!=kenar2)){
            System.out.println("ikizkenar üçgen");


        }else {
            System.out.println("ikizkenar değil");

        }


    }
}
