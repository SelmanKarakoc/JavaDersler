package day35_GenelTekrar;

import java.util.LinkedList;

public class C03_LinkedList {
    //verilen bir linkedlist te istenen iki index teki
    //elementlerin yerlerini değiştirin
    public static void main(String[] args) {

        LinkedList<String> isimler=new LinkedList<>();
        isimler.add("Said");
        isimler.add("Hüseyin");
        isimler.add("Hasan");
        isimler.add("Sevilay");
        isimler.add("Hümeyra");

        System.out.println(isimler);//[Said, Hüseyin, Hasan, Sevilay, Hümeyra]

        //Hasan ile Hümeyranın yerlerini değiştirelim
        //büyük bir listede index bilmeden yapalım

        String ilkIsim="Hasan";
        String ikinciIsim="Hümeyra";

        String temp="";
        temp=ilkIsim;

        int ilkIsimIndex= isimler.indexOf(ilkIsim);
        int ikinciIsimIndex=isimler.indexOf(ikinciIsim);

        isimler.set(ilkIsimIndex,ikinciIsim);
        isimler.set(ikinciIsimIndex,temp);

        System.out.println(isimler);




    }
}
