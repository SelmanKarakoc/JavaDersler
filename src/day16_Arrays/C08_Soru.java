package day16_Arrays;

import java.util.Arrays;

public class C08_Soru {
    public static void main(String[] args) {
        /*
        Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip,
         sondaki elementi de basa tasiyacak bir method olusturun,
          array’i yeni haliyle kaydedin.
 Orn : input : [4,5,6,7]  array’in son hali. : [7,4,5,6]
         */

        int[] arr={14,5,26,57,34,45};
        arr= arrayicinibirkaydir(arr);
        System.out.println(arrayicinibirkaydir(arr));

    }

    public static int[] arrayicinibirkaydir (int[] arr){
        int ilk=arr[arr.length-1];


        for (int i = arr.length-1; i >= 1; i--) {

            arr[i]=arr[i-1];

        }
        arr[0]=ilk;
        return arr;
    }
}
