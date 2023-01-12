package day14_doWhileLoop_scope;

public class Hastane {

    static String hastaneismi="Yıldız Hastanesi";
    static String hastaneAdresi="Çankaya/Ankara";

    String personelismi;
    String personelAdresi;
    String personelTel;

    public static void main(String[] args) {

        Hastane p1=new Hastane();
        p1.personelAdresi="Kemal";


        Hastane p3=new Hastane();
        p3.personelTel="3333333";


    }
}
