package day19_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_ForEachLoopSoru {
    public static void main(String[] args) {
        /*
        Verilen bir array’de tekrar eden elementler icin,
        mukerrer olanlari silip,
        tum elemanlardan
        sadece 1 tane yapip eski array’e yeni halini atayip yazdirin.
         */


        Integer[] arr={2,3,4,6,3,4,6,1,8,5,4};
        List<Integer> list1=new ArrayList<>();


        for (Integer each:arr
             ) {
            if (!list1.contains(each))
                list1.add(each);
        }
        //list olarak unique değerlerden oluşan bir list oluşturduk

        arr=new Integer[list1.size()];
        //simdi listteki elementleri array e kopyalayalım
        // arraya e atama yapmak için index e ihtiyacımız olduğundan
        //for-each loop kullanmak pratik değil

        for (int i = 0; i < arr.length; i++) {

            arr[i]= list1.get(i);

        }

        System.out.println("Array in yeni hali: "+Arrays.toString(arr));





    }
}
