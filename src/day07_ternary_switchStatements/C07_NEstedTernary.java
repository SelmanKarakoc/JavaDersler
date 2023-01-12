package day07_ternary_switchStatements;

public class C07_NEstedTernary {
    public static void main(String[] args) {
        /*Kullanicidan bir tamsayi alin.
 Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
 Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin

         */
        int sayi=-123;
        //System.out.println(sayi>0 ? "sayi pozitif " : "pozitif değil");
        System.out.println(sayi>0
                ?
                (sayi%2==0 ? "çift sayi" : "tek sayi")
                :
                -100>=sayi && sayi>=-999
                        ?
                "üç basamaklı"
                :
                "üç basamaklı değil");








    }
}
