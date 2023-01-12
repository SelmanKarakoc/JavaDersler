package day19_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArraydenListYapma {
    public static void main(String[] args) {

        Integer[] arr={2,3,4,6,3,4,6,1,8,5,4};
        /*
        verilen bir array i list e çevirmek için 2 yöntem vardır

        1-bir loop ile tüm elementleri list e kopyalamak
        2-asList() kullanmak
          cok tavsiye etmiyoruz, cunku 2 buyuk dezavantajı var
          -asList ile oluşturulan list, array den donusturuldugu icin
          add, remove gibi list özelliklerini kullanamıyoruz
          -asList() ile oluşturulan list ile bağlı olduğu array birbirinden
          ayrılmıyor.
          birinde yapacagımız değişiklik diğerini de etkiliyor

         */

        List<Integer> list1=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            list1.add(arr[i] );

        }
        System.out.println("Loop ile taşınan list: "+list1);


        List<Integer> list2= Arrays.asList(arr);
        System.out.println("asList ile oluşturulan list: "+list2);

        //list2.add(6);

        arr[0]=10;
        System.out.println(Arrays.toString(arr));
        System.out.println(list2);
    }
}
