package day11_ForLoops;

public class C07_TerseCevirme {
    public static void main(String[] args) {
        //Soru 10 (interview)- Kullanicidan bir String isteyin
        // ve String’i tersine cevirip kaydedin.

        String str="Java öğrenmek için çok çalışmak lazım";

        String terstenStr="";

        for (int i = str.length()-1; i >= 0 ; i--) {

            terstenStr+=str.substring(i,i+1);



        }
        System.out.println("girilen cümlenin tersten yazılışı: "+ terstenStr);








    }
}
