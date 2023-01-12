package day13_methodOverloading_whileLoop;

public class C03_MethodOverloading {
    public static void main(String[] args) {

        toplama(5.4,6.3);
        toplama('a','b');
        toplama(8.4,6);

    }


    public static void toplama(int sayi2, double sayi1){
        System.out.println("int ve double toplamı= "+(sayi1+sayi2));

    }
    public static void toplama(double sayi1,double sayi2){
        System.out.println("2 double sayi toplamı= "+(sayi1+sayi2));

    }
}
