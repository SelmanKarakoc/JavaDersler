package day06_if_else_Statements;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {

        /*Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
         “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("üçgenin kenar uzunluklarını giriniz: ");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if(kenar1 ==kenar2 && kenar2==kenar3 && kenar1>0){
            System.out.println("Eşkenar üçgen");

        }else {
            System.out.println("Eşkenar üçgen değil");
        }

/* if ile başlayan bir kod else ile bitiyorsa
input un tüm değerlerini kapsar
Yani her değer için mutlaka kodumuzda bir body çalışır
 */

    }
}
