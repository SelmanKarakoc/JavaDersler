package day23_dataTime_varargs;

public class C06_Varargs {
    public static void main(String[] args) {
        /*
        öyle bir method oluşturalım ki kaç tane argument yazarsam
        yazayım argumentlerin toplamını versib
         */

        topla(5,6);
        topla(5,8,2);
        topla(4,6,2,9,3,4,8,1,2);

        /*
        varargs array altyapısını kullanır temel hedef argument sayısı
        değişse bile aynı data türündeki tum argumentleri alabilecek
        bir parametre oluşturmaktır
         */




    }

    private static void topla(int... sayilar) {
int toplam1=0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam1+=sayilar[i];
        }
        System.out.println(toplam1);
    }
}
