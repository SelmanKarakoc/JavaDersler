package day03_dataCasting_Matematikselislemler;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {

        double dbl= 23.5;
        int sayi=(int)dbl;
        System.out.println(sayi); // 23

        byte byt=(byte)sayi;
        System.out.println(byt);

        sayi=130;
        byt=(byte)sayi; // int daha kapsamlı olduğu için oto atama yapmıyor

        System.out.println(byt); // int 130'un byte değeri -126

        sayi=255;
        byt=(byte)sayi; // int daha kapsamlı olduğu için oto atama yapmıyor

        System.out.println(byt); // int 255'un byte değeri -1




    }
}
