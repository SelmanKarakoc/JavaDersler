package day10__stringManipulations;

import java.util.Scanner;

public class C09_ForLoop {
    public static void main(String[] args) {

        //kullanıcıdan başlangıç ve bitiş değerlerini alıp
        //bu sınırlar dahil olarak, bu sayılar arasında
        //5 'in katı olan sayıları yazdır
        Scanner scan=new Scanner(System.in);
        System.out.println("Lüten iki tamsayı giriniz");
        int baslangıc= scan.nextInt();
        int bitis=scan.nextInt();


        for (int i =baslangıc; i <=bitis ; i++) {
            if (i%5==0) System.out.println(i);

        }

























    }
}
