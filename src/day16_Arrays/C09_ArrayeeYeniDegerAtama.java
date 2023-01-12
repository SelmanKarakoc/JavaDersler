package day16_Arrays;

import java.util.Arrays;

public class C09_ArrayeeYeniDegerAtama {
    public static void main(String[] args) {

        int [] arr1={1,2,3};

        //arr1={3,6,1,8};
        //arr1={5,7,1};
        //arr1=new int[5];
        System.out.println(Arrays.toString(arr1));

        //12. satırdaki atama ile java arr1'in pointer ini
        //eski array dan silip new keyword u ile oluşturduğumuz
        //yeni array e yonlendirir

        //eski elementleri de korumak istersek ne yapmalıyız?
        //o zaman atama yapmadan önce yeni array i hazırlamalıyız
        //bunun için boş bir yeni array oluşturup
        //eski array deki elementleri yeni array e taşıyıp
        //sonra atamayı yapabiliriz

        int[] temp= new int[5];

        for (int i = 0; i < arr1.length; i++) {
            temp [i]=arr1[i];

        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(temp));
        System.out.println("===================");
arr1=temp;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(temp));



    }
}
