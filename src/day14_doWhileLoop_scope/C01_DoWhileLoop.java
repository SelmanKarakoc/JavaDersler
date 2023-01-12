package day14_doWhileLoop_scope;

import java.util.Scanner;

public class C01_DoWhileLoop {
    public static void main(String[] args) {

        //kullanıcıdan istediği kadar sayi alin ve toplayın
        //kullanıcı değer olarak 0'a basarsa işlemi bitirin
        Scanner scan=new Scanner(System.in);
        int girilenSayi=1;//(0 girme)
        int toplam=0;

        while(girilenSayi!=0){

            System.out.println("Lütfen toplamak istediğiniz sayıları giriniz: ");
            girilenSayi=scan.nextInt();
            toplam+=girilenSayi;


        }
        System.out.println("Girilen sayilarin toplamı= "+ toplam);

/*
while loop un 2 tane negatif yönü vardır
1-loop'dan once oluşturduğumuz ve loop da kullanacagımız variable'lara
yanlış bir değer verirsek, loop body si hiç çalışmayabilir
2-loop condition i loop body sinde bir kez fazla çalıştırır
bu negatif yönler onu kullanılmaz yapacak buyuklukte değildir
ancak bu negatifliklerden kurtulmak istersek do-while loop kullanabiiliriz.
 */


    }
}
