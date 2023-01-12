package day06_if_else_Statements;

import java.util.Scanner;

public class C06_IfElseIf {
    public static void main(String[] args) {
        /*Kullanicidan cinsiyetini ve yasini alin,
        Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
         Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz\n K : Kadın, E: Erkek ");
        char cins=scan.next().charAt(0);
        System.out.println("Lütfen yaşınızı giriniz: ");
        int yas= scan.nextInt();

        if(cins=='K' || cins=='k' && yas>=60){
            System.out.println("Emekli olabilir.");

        }else if (cins=='K' || cins=='k'  && yas>=18){
            System.out.println("Emekli olmak için: "+ (60-yas) +"yıl daha çalışmalısın");

        } else if (cins=='E' || cins=='e' && yas>=65) {

            System.out.println("Emekli olabilir.");

        }else if (cins=='E' || cins=='e'  && yas>=18){
            System.out.println("Emekli olmak için: "+ (65-yas) +"yıl daha çalışmalısın");

        } else System.out.println("Geçersiz bilgi");

    }
}

