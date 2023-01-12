package day18_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_remove {
    public static void main(String[] args) {

        List<String> harfler=new ArrayList<>();

        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");

        System.out.println(harfler.remove("Z"));//true

        System.out.println(harfler); //[A, T]

        System.out.println(harfler.remove(0));//A
        System.out.println(harfler);//[T]

        List<String> yeniList=new ArrayList<>();

        yeniList.add("C");
        yeniList.add("D");
        yeniList.add("T");

        System.out.println(yeniList.removeAll(harfler));//true
// harler listesindeki tüm elementleri yeniList ten siler.
        System.out.println(yeniList);//[C, D]






    }
}
