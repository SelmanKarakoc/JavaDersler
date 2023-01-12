package day09_stringManipulation;

import java.util.Scanner;

public class C04_endswith {
    public static void main(String[] args) {

        String str="Java öğrenen işsiz kalmaz";

        System.out.println(str.endsWith("z"));
        System.out.println(str.endsWith("kalmaz"));
        System.out.println(str.endsWith("Java öğrenen işsiz kalmaz"));

        System.out.println(str.endsWith(""));


        /*
        SORU : kullanicidan bir mail alin
  - mail @ icermiyorsa “gecersiz mail”
  - mail @gmail.com icermiyorsa, “mail gmail olmali”
  - mail @gmail.com ile bitmiyorsa, “mailde yazim hatasi var”
 yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen mail adresi giriniz: ");
        String mail=scan.nextLine();

        if (!mail.contains("@")){
            System.out.println("geçersiz mail");


        } else if (!mail.contains("@gmail.com")) {
            System.out.println("mail gmail olmalı");


        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("mail de yazım hatası var");


        }


    }
}
