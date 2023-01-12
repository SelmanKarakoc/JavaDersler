package day22_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_PassByValue {
    public static void main(String[] args) {
        /*
        verilen bir List de değişiklik yapan 2 method oluşturun
        1. method list in elementlerine yeni değer atayıp yazdırsın
        2. method list e yeni bir list değeri atayıp, yeni list e
        elementler ekleyip yazdırsın
        her iki method u çağırdıktan sonra main method dali list e yazdıralım

         */
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(34);
        sayilar.add(45);
        System.out.println(sayilar);//[10,34,45]

        elemanlariDegistir(sayilar);

        System.out.println("1.method call dan sonra sayilar: "+sayilar);//[25, 54, 67]

        yeniListAta(sayilar);

        System.out.println("2.method call dan sonra sayılar: "+sayilar);//[25, 54, 67]
        /*
        Java PassByValue kullanır.
        PassByValue, method a gönderilen variable ın kendisini değil
        değerini göndermek demektir.
        Primitive data turleri veya String gönderdiğimizde method da yapılan
        değişiklik method da kalır.
        Main method da atama yapılmadıkça main method daki variable in değeri değişmez.

        PassByValue çoklu element içeren array ve list gibi yapılar için de geçerlidir.
        Ancak çoklu elementi value olarak method a gönderemediğinden
        array veya List in adresini gönderir.
        Eğer method da elementlere atama yapılırsa main method daki
        elementler de değişmiş olur.
        Eğer list veya array e yeni bir list veya array değeri atanırsa
        bu atama method da kalır, main method daki list veya array değişmez.


       Araba aynı kaldığı müddetçe içerisindekilerin değişmesi PassByValue e
       aykırı değildir.
         */


    }
    public static void elemanlariDegistir(List<Integer> sayilar){
        sayilar.set(0,25);
        sayilar.set(1,54);
        sayilar.set(2,67);

        System.out.println("elemanlari değiştir methodunda list: "+sayilar);//[25, 54, 67]

    }

    public static void yeniListAta(List<Integer> sayilar){

        sayilar=new ArrayList<>();
        sayilar.add(34);
        sayilar.add(98);
        sayilar.add(11);
        System.out.println("Yeni List ata methodunda sayilar listinin son hali: "+sayilar);
    }
}
