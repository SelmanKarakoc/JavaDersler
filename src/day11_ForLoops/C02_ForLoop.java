package day11_ForLoops;

public class C02_ForLoop {
    public static void main(String[] args) {
        //input olarak verilen bir string de
        //index i tek sayı olanları kucuk harfle
        //index i çift sayı olanları buyuk harfle yazıdırın
        //örnek : java output:


        String input="Java candir, Selenium heyecandir";

        for (int i = 0; i <input.length() ; i++) {
            System.out.print(i%2==0
                    ? input.substring(i,i+1).toUpperCase()
                    : input.substring(i,i+1).toLowerCase()
            );


        }





















    }
}
