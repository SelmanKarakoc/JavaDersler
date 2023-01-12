package day17_arrays;

import java.util.Arrays;

public class C08_MDA {
    public static void main(String[] args) {
       /* Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip,
        yeni olusturacagimiz tek katli bir array’e
        bu toplamlari atayin.
                input : int[][] arr = {{3,4,5}, {2,3,6,7}};
                output:                  [5, 7, 11]

        */

        //dinamik hala getirebilmek için önce inner array lerden
        //en kısa olanı bulmamız gerekir

        int[][] arr = {{3,4,5}, {2,3,6,7},{4,3}};

        int enKisaArrayLenght= arr[0].length;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length<enKisaArrayLenght){
                enKisaArrayLenght=arr[i].length;
            }

        }

        //aynı index deki elementleri topladığımızda koyacağımız
        //tek katlı bir array oluşturalım

        int[] toplamlarArrayi=new int[enKisaArrayLenght];
        int toplam=0;
        for (int i = 0; i < toplamlarArrayi.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                toplam+=arr[i][j];

            }

            toplamlarArrayi[i]=toplam;
            toplam=0;

        }
        System.out.println(Arrays.toString(toplamlarArrayi));


    }
}
