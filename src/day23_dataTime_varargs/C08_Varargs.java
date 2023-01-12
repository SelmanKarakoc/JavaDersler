package day23_dataTime_varargs;

public class C08_Varargs {
    public static void main(String[] args) {
        /*
        Argument olarak tamsayilar alıp ilk argument hariç geriye
        kalanları toplayıp bulunan toplamı ilk argumnet ile çarpıp
        sonucu yazdıran bir method oluşturun
        not:argument sayısı değişken olabilir
         */

        toplacarp(3,4,5,8,1,2);//60
        toplacarp(5,1);//5
        toplacarp(4);//0
        //toplacarp();
        toplacarp(3,4,5,6);






    }

    private static void toplacarp(int ilk, int... geriyeKalanlar) {

        int geriyeKalanlarToplamı=0;

        for (int each:geriyeKalanlar
             ) {
            geriyeKalanlarToplamı+=each;

        }
        System.out.println(geriyeKalanlarToplamı*ilk);
    }
}
