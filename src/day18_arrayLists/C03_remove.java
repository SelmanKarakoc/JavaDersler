package day18_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_remove {
    public static void main(String[] args) {


        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(10);
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(9);

        System.out.println(sayilar);//[10, 5, 7, 9]

        //sayilar.remove(5);//IndexOutOfBoundsException
        /*
        eğer listemiz int lardan oluşuyorsa parametre olarak yazdığımız
        sayının index mi yoksa silmek istediğimiz obje mi olduğu belirsiz
        olmasın diye Java otomatik olarak girilen sayıyı index olarak kabul eder

         Eğer int lardan oluşan bir listede obje olarak bir elementi
         silmek isterseniz önce onu tanımlamalısınız

         */
        Integer silinecekElement=5;
        System.out.println(sayilar.remove(silinecekElement));//true
        System.out.println(sayilar);//[10, 7, 9]

        silinecekElement=20;

        System.out.println(sayilar.remove(silinecekElement));//false




    }
}
