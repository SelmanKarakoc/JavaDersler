package test_carsamba;

public class C01_q1 {
    public static void main(String[] args) {
      //  100 den 0 a kadar 13 e tam bölünebilen sayıları ve toplamlarını
       //         ekrana yazdır


        int toplam=0;
        for (int i =100; i >0 ; i--) {
            if (i%13==0){
                System.out.println(i+" sayısı 13 e tam bölünür.");
                toplam+=i;
            }

        }

        System.out.println("toplam= "+ toplam);
    }
}
