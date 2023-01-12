package day23_dataTime_varargs;

public class C07_Varargs {
    public static void main(String[] args) {
        /*
        kaç tane String argument yazılırsa yazılsın
        argumentlerin en uzun olanını yazdıran bir method oluşturun
        not:en uzun kelime olarak birden fazla kelime varsa
        ilkini yazdır
         */

        enUzunuYazdir("Ilyas","Berivan","Murat");




    }

    private static void enUzunuYazdir(String... kelimeler) {
        String enUzunKelime=kelimeler[0];

        for (String eachKelime:kelimeler
             ) {
  if (eachKelime.length()>enUzunKelime.length()) enUzunKelime=eachKelime;
        }
        System.out.println(enUzunKelime);
    }
}
