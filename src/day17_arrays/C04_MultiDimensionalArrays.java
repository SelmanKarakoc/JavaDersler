package day17_arrays;

import java.util.Arrays;

public class C04_MultiDimensionalArrays {
    public static void main(String[] args) {

        int[][] arr={{1,2},{3,4,5},{6,7,4,5},{2},{1,2,3,4,5}};

        System.out.println(arr.length);// 5
        System.out.println(arr[2].length);//4

        System.out.println(arr[2][1]);// 7

        System.out.println(arr[3]);//[I@58ceff1

        //multidimensional array ile çalışırken dikkat etmemiz gereken
        //en önemli konu yazdığımız kodun bir array mi yoksa yazdırabileceğimiz
        //bir element mi dödürdüğüdür

        System.out.println(Arrays.toString(arr[3]));//[2]
        System.out.println(arr[3][0]);

        //multidimensional array ın tümünü yazdırmak isterseniz
        //tek katlı array leri yazdırmak için kullandığımız yöntem yeterli olmaz

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.deepToString(arr));


    }
}
