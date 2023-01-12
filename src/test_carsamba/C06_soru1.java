package test_carsamba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_soru1 {
    public static void main(String[] args) {
        /*
Verilen bir arrayin elemanlarını ardışık toplamını hesaplayan metodu yazınız
input={ 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
output={3, 5+1, 2+7+9, 2+3+5+7}
       {3,  6,   18,     17}
*/



        int[] input = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
        System.out.println(Arrays.toString(cumulativeSum(input)));

    }


        public static int[] cumulativeSum(int[] arr) {
            int[] result = new int[4];
            int cumulativeSum = 0;
            result[0]=arr[0];
            for (int i = 1; i < result.length; i++) {
                for (int j = 1; j <=i+1; j++) {
                    cumulativeSum+=arr[j];


                }
                result[i]=cumulativeSum;

            }
            return result;
        }







    }



