package day10__stringManipulations;

public class C08_ForLoop {
    public static void main(String[] args) {
        /* 1 ile 1000 arasındaki sayıları
        yan yana yazdırın
        yazdırma işlemi bittiğinde
        "tüm bu sayıların toplamı= " deyip sayıların toplamını yazdırın
         */

        int sayilarınToplamı=0;

        for (int i = 1; i <=1000 ; i++) {
            System.out.print(i+ " ");
            //sayilarınToplamı=sayilarınToplamı+i;
            sayilarınToplamı+=i;


        }

        System.out.println("");
        System.out.println("Tüm bu sayıların toplamı="+ sayilarınToplamı);















    }
}
