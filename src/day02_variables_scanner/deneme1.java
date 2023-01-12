package day02_variables_scanner;

import java.util.Scanner;

public class deneme1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen İsminizi Giriniz : ");
        String isim=scan.nextLine();
        System.out.println("Lütfen Soyisminizi Giriniz : ");
        String soyisim= scan.nextLine();
        System.out.println("Lütfen Yaşınızı Giriniz : ");
        int yas= scan.nextInt();
        System.out.println(isim.toUpperCase().charAt(0)+" " +  soyisim.toUpperCase()+", "+ yas);




    }
}
