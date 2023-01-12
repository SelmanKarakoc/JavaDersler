package day22_immutableClasses;

public class C04_StringEquals {
    public static void main(String[] args) {
/*
Java String lerde her sseferinde yeni obje oluşturmamak için
String havuzu kullanır
eğer String oluşturulerken bugüne kadar yaptığımız gibi basit şekilde
oluşturulursa havuzu kontrol eder ve aynı değer varsa bunları özdeşleştirir
Ancak new keyword kullanılır veya bir işlem sonucunda String elde edilecek
olursa
 */
        String str1="Java";
        String str2="Java";
        String str3=new String("Java");
        String a="Ja";
        String b="va";
        String str4="a+b";
        String str5=a.concat(b);

        String str6=str5+"";

        System.out.println(str1.equals(str2));// true
        System.out.println(str1.equals(str3));// true
        System.out.println(str1.equals(str4));// true
        System.out.println(str1.equals(str5));// true
        System.out.println(str1.equals(str6));// true
        System.out.println(str1.equals("Java"));// true
        //sadece değerlere bakar
        System.out.println("===================");

        System.out.println(str1==str2);// true
        System.out.println(str1==str3);// false
        System.out.println(str1==str4);// false
        System.out.println(str1==str5);// false
        System.out.println(str1==str6);// false
        System.out.println(str1=="Java");// true
        // == hem referansa hem değere bakar







    }
}
