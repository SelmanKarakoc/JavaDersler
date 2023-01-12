package day10__stringManipulations;

public class C10_ForLoop {
    public static void main(String[] args) {
        //input olarak verilen sayıdan başlayıp
        //7 ser 7ser artırarak input olarak verilen bitis sayısına kadar
        //tum sayıları
        //kaç adet olduğunu
        //ve bu sayıların top yazdır

        int inputBas=34;
        int inputBit=563;

        int sayac=0;
        int toplam=0;


        for (int i = inputBas; i <=inputBit ; i+=7) {
            System.out.print(i+" ");
            sayac++;
            toplam+=i;



        }
        System.out.println("");
        System.out.println("Toplam "+ sayac +" adet sayı var \n" +
                "Bu sayıların toplamı= "+ toplam);



    }
}
