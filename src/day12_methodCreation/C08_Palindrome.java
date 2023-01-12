package day12_methodCreation;

public class C08_Palindrome {
    public static void main(String[] args) {
        //verilen string in palindrome olup olmadığını yazdır
        //düz okunuşu ile tersten okunuşu birbirine aynı olan

        String str="ey edip adanada pide ye";

        String tersStr=C07_TerseCevirme.metniTerseCevir(str);

        if (str.equals(tersStr)){
            System.out.println("verilen metin palindrome");
        }else System.out.println("verilen metin palindrome değil");
    }
}
