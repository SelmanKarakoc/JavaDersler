package day36_genelTekrar;

import java.util.Scanner;

public class C01_RecursiveMethods {
    //kullanıcıdan pozitif bir tamsayı alip
    //o sayidan sıfıra kadar olan pozitif tamsayıları toplayın
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Pozitif bir tam sayı girin");
        int sayi= scan.nextInt();

        toplaForLoop(sayi);
        System.out.println("Recursive toplam= "+toplaRecursive(sayi));

    }

    private static int toplaRecursive(int sayi) {

        if (sayi>0)
            return sayi+toplaRecursive(sayi-1);
        else return sayi;
        }




    private static void toplaForLoop(int sayi) {

        int toplam=0;

        for (int i = 0; i <=sayi ; i++) {
            toplam+=i;

        }
        System.out.println("Toplam for loop ile: "+toplam);

    }
}
