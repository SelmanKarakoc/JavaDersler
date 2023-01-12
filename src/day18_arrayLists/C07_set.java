package day18_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C07_set {
    public static void main(String[] args) {

        //Java da bir cok yapıda get ve set methotlari bulunur
        //get methotları bize bilgiyi getirirken
        //set methotları bize bilgiyi update eder

        List<String> harfler=new ArrayList<>();

        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");

        System.out.println(harfler);

        //2. indexe F elemanını ekleyin
        //add methotu var olan listeden herhangi bir elemnti değiştirmeden
        //istediğimiz elementi ekler kalanları bir kaydırır

        harfler.add(2,"F");
        System.out.println(harfler);//[A, Z, F, T]

        //set siler yerine yazar

        harfler.set(2,"M");

        System.out.println(harfler);//[A, Z, M, T]








    }
}
