package day08_StringManipulation;

public class C04_equalsignoreCase {
    public static void main(String[] args) {

        String str1="Pazar";
        String str2="PAZAR";
        String str3="pazar";
        String str4="PaZaR";

        System.out.println(str1==str2); //false
        System.out.println(str1==str3);//false
        System.out.println(str1==str4);//false

        System.out.println(str1.equals(str2)); //false
        System.out.println(str1.equals(str3));//false
        System.out.println(str1.equals(str4));//false
        /*
        eğer iki metni "karşılaştırırken" buyuk kucuk harf duyarlılığı
        (case sensitive) önemsiz ise o zaman
        equalsIgnoreCase() kullanılır
         */

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equalsIgnoreCase(str4));













    }
}
