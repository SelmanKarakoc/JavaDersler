package day19_arrayList_forEachLoop;

public class C06_ForEachLoopSoru {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan bir cumle ve bir harf alin,
         harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
          kullanilmadiysa “harf cumlede kullanilmamis” yazdirin

         */

        String cumle="Java ogrenmek cok guzel";
        String harf="e";

        String [] cumleArr=cumle.split("");

        int sayac=0;

        for (String each:cumleArr
             ) {
            if (each.equalsIgnoreCase(harf)) {
                sayac++;

            }

            
        }

        if (sayac==0)
            System.out.println(harf+" harfi cumlede kullanılmamış");
        else System.out.println(harf+" harfi cumlede "+sayac+" defa kullanılmış");
    }
}
