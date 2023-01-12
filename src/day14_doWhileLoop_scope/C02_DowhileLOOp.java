package day14_doWhileLoop_scope;

import java.util.Scanner;

public class C02_DowhileLOOp {
    public static void main(String[] args) {
        //kullanıcıdan istediği kadar sayi alin ve toplayın
        //kullanıcı değer olarak 0'a basarsa işlemi bitirin
        Scanner scan=new Scanner(System.in);
        int girilenSayi=0;
        int toplam=0;
        do {
            System.out.println("Lütfen toplamak istediğiniz sayıları giriniz: ");
            girilenSayi=scan.nextInt();
            toplam+=girilenSayi;

        }while(girilenSayi!=0);

        System.out.println("Girilen sayilarin toplamı= "+ toplam);
/*
while loop ta ilk şart sağlanmazsa loop body hiç ÇALIŞMAZ
do-while loop da once body çalıştığı için, şart yanlış olsa bile
loop body'si en az 1 kere çalışmış olur
 */


    }
}
