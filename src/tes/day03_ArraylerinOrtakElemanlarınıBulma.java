package tes;

import java.util.ArrayList;

public class day03_ArraylerinOrtakElemanlarınıBulma {
    public static void main(String[] args) {
        /*
         * iki array arasinda ayni olan elemanlari bir liste ekleyen program yazin
         * (buyuk kucuk harf onemsiz)
         *
         * Input1 : {John,Brad,Ange,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
         *
         * Output : [sofia,brad,emily]
         */

        String [] Input1= {"John","Brad","Angel","Sofia","Emily"};
        String [] Input2= {"sofia","brad","grace","emily","hazel"};

        ortakElemanlar(Input1,Input2);


    }

    private static void ortakElemanlar(String[] input1, String[] input2) {

        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < input1.length; i++) {

            for (int j = 0; j < input2.length; j++) {

                if (input1[i].equalsIgnoreCase(input2[j])) {
                    arrayList.add(input1[i]);

                }

            }
        }
        System.out.println(arrayList);

    }
}
