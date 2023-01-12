package day16_Arrays;

public class C06_Soru {
    public static void main(String[] args) {
        /*
        bir marketin fiyatlarını tutan bir array var
        bu marketteki en yuksek ve en dusuk fiyatları yazdıran
        bir method oluşturun
         */
        double[] fiyatlar={23,34.5,42.1,5.7,3.4,23.5};

        enYuksekenDusukFiyatYazdır(fiyatlar);


    }

    public static void enYuksekenDusukFiyatYazdır(double[] arr){

        double enDusukFiyat=arr[0];
        double enYuksekFiyat=arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]<enDusukFiyat) enDusukFiyat=arr[i];

            if (arr[i]>enYuksekFiyat) enYuksekFiyat=arr[i];

        }
        System.out.println("Listedeki en düşük fiyat= "+enDusukFiyat
                           +"\nLisetedeki en yüksek fiyat= "+enYuksekFiyat);

    }
}
