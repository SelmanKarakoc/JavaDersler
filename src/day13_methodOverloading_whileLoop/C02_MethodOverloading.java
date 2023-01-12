package day13_methodOverloading_whileLoop;

public class C02_MethodOverloading {
    public static void main(String[] args) {
        String str="Java cok guzel";

        System.out.println(str.substring(5));
        System.out.println(str.substring(3, 5));

//eğer seçtiğimiz isimde birden fazla method varsa buna overloading denir
//ve aynı isimdeki method lardan hangisinin çalışacağına arguement/parametre uyumu karar verir

toplama(5,6);
toplama(5,3,1);

/*
java aynı class içerisinde aynı isim ve
aynı data turunden parametre sayısı ile
2 methot oluşturmaya izin vermez
1-ismini değiştirebiliriz ancak bu durumda overloading olmaz
2-parametre sayisini değiştirebiliriz
3-aynı sayıda parametre yazıp data türünü değiştirebiliriz
4-farklı data türlerinin yerlerini değiştirebiliriz
 */

        toplama(6,6);
        toplama(4.5,5);
        toplama(4.5,6.7);


    }
    public static void toplama(int sayi1, int sayi2){
        System.out.println("2 tamsayının toplamı= "+(sayi1+sayi2));
    }

    public static void toplama(int sayi1, int sayi2, int sayi3){
        System.out.println("3 tamsayının toplamı= "+(sayi1+sayi2+sayi3));

    }
    public static void toplama(double sayi1, int sayi2){
        System.out.println("double ve int toplamı= "+(sayi1+sayi2));
    }
    public static void toplama(int sayi2, double sayi1){
        System.out.println("int ve double toplamı= "+(sayi1+sayi2));

    }
    public static void toplama(double sayi1,double sayi2){
        System.out.println("2 double sayi toplamı= "+(sayi1+sayi2));

    }




}
