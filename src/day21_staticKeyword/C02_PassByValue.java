package day21_staticKeyword;

public class C02_PassByValue {
    public static void main(String[] args) {
        //Java PassByValue kullanır
        //yani method lar arasında gönderilen variable ların kendileri
        //değil value ları diğer method a yollanır

        int fiyat=100;
        //fiyat üzerinden yuzde 10 indirim yapıp
        //indirimli fiyatı döndüren method oluşturun

        System.out.println(indirimliFiyat(fiyat));

        System.out.println(fiyat);

        fiyat=indirimliFiyat(fiyat);



    }

    public static int indirimliFiyat(int fiyat){

        fiyat=fiyat*90/100;
    return fiyat;
    }

}
