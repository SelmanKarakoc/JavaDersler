package day08_StringManipulation;

public class C05_charAt {
    public static void main(String[] args) {

        String str="Java guzeldir"; // 13

        //Java da index 0 dan başlar
        //J==> 0.index, r==>12

        //ilk a yı yazdıralım
        System.out.println(str.charAt(1));

        //sondan 2. harfi yazdıralım
        System.out.println(str.charAt(13-2));

        //sondan 4. karakyeri buyuk harf olarak yazdırın

        System.out.println(str.toUpperCase().charAt(13-4));


        //System.out.println(str.charAt(13));// out of range
        //eğer index olarak karakter sayısı veya daha buyuk değer
        // girersek o index i bulamayacağı için çalıştırınca hata verir












    }
}
