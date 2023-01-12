package day10__stringManipulations;

public class C06_soru {
    public static void main(String[] args) {
        /*
        Soru 4 : Kullanicidan bir sifre isteyip,
         asagidaki sartlari kontrol edin ve
          kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
           eger tum sartlari saglarsa, “sifre basariyla kaydedildi” yazdirin
  - ilk harf kucuk harf olmali
  - son karakter rakam olmali
  - sifre bosluk icermemeli
  - uzunlugu en az 10 karakter olmali
         */

        String sifre="abc14asd53";

        /*
        bu soruda şartlari bağımsız if cumlesi ile yapmak
        veya if-else ile yapmak mumkundur

        -eğer if-else ile yaparsak ilk hatada hatayı yazdırır
        geriye kalanlara bakmaz
        avantajı ise eger hata yoksa otomatik olarak basarılı diyebilir

        -bagımsız if cumlelerinde tum hataları bir kerede soyleyebiliriz
        ancak bağımsız if cumleleri kodun geriye kalanı ile ilgilenmediğinden
        basarılı sifre olusturulduğunu bizim ayrı bir mekanizma ile kontrol etmemiz lazım

         */
        /*
        sonucta basarılı sifre oluşturuldu demek için bir kontrol mekanizması
        oluşturmamız gerekir
        ya her adımda arartıracağımız bir sayaç yapıp en son 4 oldu ise başarılı deriz
        veya basta verdiğimiz değer olumsuz ise artırılır

         */

        int flag=0;

        //- ilk harf kucuk harf olmali
        if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){//ilk harf kucuk değilse hatayı yazdır
            System.out.println("ilk harf kucuk olmalı");
            flag++;
        }

        // - son karakter rakam olmali
        if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')){
            System.out.println("son karakter rakam olmalı");
            flag++;

        }
        //      - sifre bosluk icermemeli

        if (sifre.contains(" ")){
            System.out.println("sifre boşluk içermemeli");
            flag++;
        }
        //  - uzunlugu en az 10 karakter olmali
        if (!(sifre.length()>=10)) {
            System.out.println("sifrenin uzunluğu en az 10 karakter olmalı");
            flag++;
        }

        if (flag==0) System.out.println("şifreniz başarıyla kaydedildi");


























    }
}
