package day06_if_else_Statements;

import java.util.Scanner;

public class C09_NestedIfElse {
    public static void main(String[] args) {
        /*Kullanicidan cinsiyetini ve yasini alin,
        Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
         Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
         */
        // eğer değişken sayimiz fazla ise
        //değişkenlerin birini önceliğe alarak
        //ona göre bir if else yapısı kurulur
        //ornegin bu soruda kadın/erkek seçimini ana değişken yapalım

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz\n K : Kadın, E: Erkek ");
        char cins=scan.next().charAt(0);
        System.out.println("Lütfen yaşınızı giriniz: ");
        int yas= scan.nextInt();

        if (cins=='K' || cins=='k'){ //kadın olanlar için bu bölüm
            if(yas<18 || yas>80) System.out.println("geçersiz yaş");
            else if (yas>=60) System.out.println("Emekli olabilirsin");
            else System.out.println("emekli olmak için "+ (60-yas)+"yıl daha çalışmalısın");




        } else if (cins=='E' || cins=='e') {
            if (cins=='E' || cins=='e'){ //kadın olanlar için bu bölüm
                if(yas<18 || yas>80) System.out.println("geçersiz yaş");
                else if (yas>=65) System.out.println("Emekli olabilirsin");
                else System.out.println("emekli olmak için "+ (65-yas)+"yıl daha çalışmalısın");



            }else System.out.println("cinsiyet bilgisi hatalı");
        }


    }
}
