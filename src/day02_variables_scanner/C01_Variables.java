package day02_variables_scanner;

public class C01_Variables {
    /*
    Java'da kodlarimizi class'larda oluştururuz
    Class'lar ihtiyaç duyulduğunda obje oluşturmak için de kullanılır

    Java'nın başlangıç noktası(entry point) main methottur

    variables is formed to store our datas
     */

    public static void main(String[] args) {

        System.out.println("Java Candir");

        String              OgrenciIsmi        =           "Matrix";
        //Data türü        variable ismi     assignment    deger

        System.out.println(OgrenciIsmi);

        OgrenciIsmi="Selman";
        System.out.println(OgrenciIsmi);
    }
}
