package day10__stringManipulations;

public class C03_replaceAll {
    public static void main(String[] args) {
        // bu metindeki sayılardan kurtulun
        String str="Ja1va 56Guz,zel-dir";

        System.out.println(str.replace("1","")
                .replace("5","")
                .replace("6",""));


        str="Ja1va4 567Guz,9el-d0ir8";
        /*
        replace methotu zaten istenen değişikliği verilen özelliğe
        uyan tüm değerler için yapar
        eğer genellemeyi bütün rakamları, butun space leri, butun özel karakterleri
        gibi genişletmek istersek replace() methotunun yerine replaceAll() kullanırız
Java bu genellemeleri yazabilmemiz için regex(regular expressions) tanımlamıştır
   // d : bütün digitler
         */

        str=str.replaceAll("\\d","");

        System.out.println(str);

        //ozel karakterlerden de kurtulun
        //space de ozel karakter olduğundan bu space in yok olmaması için
        //önce space yerine metinde olmayan bir değer atayalım

        str=str.replace(" ","5");
        str=str.replaceAll("\\W","");

        str=str.replace("5"," ");

        System.out.println(str);


        //buradaki harf sayisini bulun
        String input3="Ali Can, Merve Star, Mark Tom";

        input3=input3.replaceAll("\\W","");
        System.out.println(input3.length());







































    }
}
