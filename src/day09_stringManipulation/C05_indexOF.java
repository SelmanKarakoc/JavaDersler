package day09_stringManipulation;

public class C05_indexOF {
    public static void main(String[] args) {

        String str="Java ile kodlama çok kolay";

        //str "çok" içeriyor mu
        System.out.println(str.contains("çok"));

        //kullanıcıdan aldığımız cümle "çok" ile başlayan ilk kelimeyi yazdır

        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf("v"));

        System.out.println(str.indexOf("çok"));

        System.out.println(str.indexOf("a", 5));

        //2. o nun indexini yazdırın

        int ilkOindexi=str.indexOf("o");
        int ikinciOindexi=str.indexOf("o",ilkOindexi+1);

        System.out.println(ilkOindexi+" "+ikinciOindexi);


    }
}
