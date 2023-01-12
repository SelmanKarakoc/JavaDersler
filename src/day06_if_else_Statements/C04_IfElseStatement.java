package day06_if_else_Statements;

import java.util.Scanner;

public class C04_IfElseStatement {
    public static void main(String[] args) {
        /*Kullanicidan bir karakter girmesini isteyin,
         girilen karakterin buyuk harf olup olmadigini yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir karakter girin: ");

        char girilenkarakter=scan.next().charAt(0);
        //if (girilenkarakter>='A' && girilenkarakter<='Z')
        if(girilenkarakter>=65 && girilenkarakter<=90){
            System.out.println("girilen karakter büyük harf.");

        }else{
            System.out.println("büyük harf değildir.");
        }

    }
}
