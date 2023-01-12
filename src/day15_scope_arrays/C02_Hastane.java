package day15_scope_arrays;

public class C02_Hastane {
    static String hastaneismi="Yıldız Hastanesi";
    static String hastaneAdresi="Çankaya/Ankara";

    String personelismi="Personel";
    String personelAdresi="Adres";
    String personelTel="Telefon";

    public static void main(String[] args) {

        C02_Hastane per1=new C02_Hastane();


        C02_Hastane per2=new C02_Hastane();

        per1.personelismi="Harun";

        per2.personelAdresi="Çankaya";





    }
}
