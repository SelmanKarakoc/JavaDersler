package day10__stringManipulations;

public class C04_replaceFirst {

    public static void main(String[] args) {

        String str="Java heyecandir";

        // eğer tüm a lari değilde sadece ilk a yı
        // a yı değistirmek istersen

        System.out.println(str.replaceFirst("a", "A"));


        //ilk harf veya rakamı * yap
        System.out.println(str.replaceFirst("//w", "*"));


    }

    public static class C05_Soru {
        public static void main(String[] args) {
            /*
            Soru 1 : Kullanicidan bir cumle alin
      - cumlede ev geciyorsa, “home home sweet home” yazdirin
      - cumlede is geciyorsa, “calismak guzeldir”
      - ikisini de iceriyorsa “Hem ev lazim hem is”
      - hicbirini icermiyorsa “cok calisman lazim” yazdirin
             */
            String str="Evden çalışıyorum, ise gitmeye gerek yok";

            String calisilacakStr=str.toLowerCase();

            if (calisilacakStr.contains("ev") && calisilacakStr.contains("is")){
                System.out.println("Hem ev lazim hem is");
            } else if (calisilacakStr.contains("is")){
                System.out.println("calismak guzeldir");
            } else if (calisilacakStr.contains("ev") ) {
                System.out.println("home home sweet home");

            }else System.out.println("cok calısmam lazım cok");


        }
    }
}
