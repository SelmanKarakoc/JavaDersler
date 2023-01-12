package day19_arrayList_forEachLoop;

public class C03_ForEachLoop {
    public static void main(String[] args) {
        /*
        eğer çoklu element içeren bir yapıdaki tum elementlere
        aynı işlemi yapmak istiyorsak
        index den bağımsız olarak for each loop kullanılabilir

        for each loop da 3 seyi belirtmemiz gerekir
        1-getirilecek elementlerin data turu
        2-getirilen elemente verilecek isim(genelde each veya w kullanılır)
        3-nereden getirileceği
         */



        int[] arr={2,4,6,8,1};

        //bu array in tum elemntlerini yazdıralım

        for (int each:arr
             ) {
            System.out.print(each+" ");
        }
        //tum elementleri toplayalım
        int toplam=0;

        for (int each:arr
             ) {
            toplam+=each;


        }
        System.out.println(" \nsayıların toplamı= "+toplam);

//tum syıların karelerini toplayalım
        toplam=0;
        for (int each:arr
             ) {
            toplam+=each*each;
        }
        System.out.println("\n sayıların kareleri toplamı= "+toplam);
        }
    }
