package day16_Arrays;

import java.util.Arrays;

public class C10_ArrayeBirElementEkleme {
    public static void main(String[] args) {
        /*
        soru 7- Verilen bir array’e istenen bir elemani ekleyip
         bize donduren bir method yazin,
        eski array’e yeni degeri atayin.
         */
        String [] isimler={"Ali","Veli","Can"};
        String eklenecekisim="Kemal";

        isimler=arrayeElementEkleme(isimler,"Kemal");

        System.out.println(Arrays.toString(isimler));

    }

    public static String[] arrayeElementEkleme(String [] arr, String element){

        String[] temp=new String[arr.length+1];

        for (int i = 0; i < arr.length; i++) {

            temp[i]=arr[i];

        }
        temp[temp.length-1]=element;
        return temp;
    }
}
