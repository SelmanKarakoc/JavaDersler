package day16_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C11_Odev {
    public static void main(String[] args) {
        /*
        kullanıcıdan yeni isimler alıp var olan bir array e
        ekleyen bir method oluşturun
        kullanıcı yeni değer verdiği muddetçe C10 daki methodu kullanarak
        eklemeye devam edin, kullanıcı q ya bastığında array in son halini döndürün
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen eklemek istediğiniz isimi giriniz: ");
        String str=scan.nextLine();
        String [] isimler={"Ali","Veli","Can"};

        boolean tekrarİsimİste=true;

        do {
            isimler=C10_ArrayeBirElementEkleme.arrayeElementEkleme(isimler,str);
            System.out.println("Bir isim daha giriniz: "+"(bu işlem q ya basana kadar devam edecektir.)");
            str=scan.nextLine();
            if (str.equalsIgnoreCase("q")) {
                tekrarİsimİste = false;
                break;
            }





    }while(tekrarİsimİste);
        System.out.println(Arrays.toString(isimler));



    }
}
