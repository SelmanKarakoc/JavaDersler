package day17_arrays;

import java.util.Arrays;

public class C03_StringSplitMethodu {
    public static void main(String[] args) {

        String str="Java her geçen gün güzelleşiyor";

        //str da kaç kelime var? 5
        //split methodu istediğimiz String i istedğimiz ayracı
        //kullanarak parçalara ayırmamıza izin verir

        String[] spacesplit=str.split(" ");
        System.out.println(Arrays.toString(spacesplit));
        System.out.println("Verilen cumledeki kelime sayısı: "+ spacesplit.length);
        System.out.println(Arrays.toString(str.split("")));
    }
}
