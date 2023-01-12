package day18_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_soru {
    public static void main(String[] args) {
        //verilen bir array deki tekrar eden elementleri silip
        //array i unique değerlerden oluşan bir array haline getirin

        int[] arr={4,3,6,7,3,5,3,6,7,3,5,4,6,4,7,7,7,5};

        List<Integer> sayilar=new ArrayList<>();
        //array deki tum elementleri alip
        //listede var mi diye kontrol edelim
          //      ve olmayanları ekleyelim

        for (int i = 0; i < arr.length; i++) {

            if (!sayilar.contains(arr[i])) sayilar.add(arr[i] );
        }
        System.out.println(sayilar);

        //soruda bu değerleri arr ye atamamız isteniyor

        arr=new int[sayilar.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= sayilar.get(i);

        }

        System.out.println(Arrays.toString(arr));



    }
}
