package day04_Increment_Concatenation;

public class C01_Pre_PostIncrement {
    public static void main(String[] args) {

        int sayi=20;
        //sayiyi 3 artır

        sayi=sayi+3;
        sayi +=3;

        System.out.println(sayi);

        //sayiyi 2 azalt
        sayi=sayi-2;
        sayi-=2;

        sayi=10;
        // sayinin değerini bir azalt ve yazdır

        sayi--;
        System.out.println(sayi);
        //bu işlemde ekranda gördüğümüz 9, sayinin değeri 9
        sayi=10;
        // sayiyi önce yazdır sonra 1 azalt

        System.out.println(sayi);

        sayi--;

        //ekranda görülen 10, sayinin değeri 9



        sayi=10;
        System.out.println(sayi++);
        //java aynı satırda 2 işlem olduğundan sıralama yapar
        //eğer ++ variable dan sonra ise artırma işlemini sonra yapar
        //önce yazdırır sonra artırır
        System.out.println(sayi);

        sayi=10;

        System.out.println(++sayi);
        // ++ variable dan önce ise artırma işlemini önce yapar
        // bu durumda java önce artırma sonra yazdırma işlemini yapar


        System.out.println(sayi);




    }
}
