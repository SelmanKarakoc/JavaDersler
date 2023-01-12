package day02_variables_scanner;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen alanını hesaplamak istediğiniz çemberin yarıçapını giriniz:");
        double yaricap= scan.nextDouble();
        System.out.println("Çemberin Alanı : "+ (yaricap*yaricap*3.14));


    }
}
