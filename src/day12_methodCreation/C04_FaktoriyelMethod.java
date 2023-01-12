package day12_methodCreation;

public class C04_FaktoriyelMethod {
    public static void main(String[] args) {
        //verilen bir sayinin 15 ten kucuk bir pozitif tam sayı
        //olduğunu kontrol edin
        //kucukse bir method oluşturup
        //faktoriyel değerini yazdırın
        //sayi istenen aralıkta değilse uyarı yazdır


        int input=5;
        if (input>0 && input<15){
            fatoriyelyazdır(input);

        }else System.out.println("sayi 0 dan kucuk ya da 15 ten büyük");



    }
    public static void fatoriyelyazdır(int sayi){

        int faktoriyelSonucu=1;

        for (int i = sayi; i >=1 ; i--) {

            faktoriyelSonucu*=i;


        }
        System.out.println("Girilen "+sayi+" için faktoriyeli "+faktoriyelSonucu);
    }


}
