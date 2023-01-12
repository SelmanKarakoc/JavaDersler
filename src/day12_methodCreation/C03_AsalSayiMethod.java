package day12_methodCreation;

public class C03_AsalSayiMethod {
    public static void main(String[] args) {

        //verilen bir sayinin asal olup olmadığını true
        //false olarak dödüren bir method
        boolean sonuc;
        sonuc=asalsayiMi(59);
        System.out.println(sonuc);
    }

    public static boolean asalsayiMi(int input){

        boolean asalsayiMi=true;

        for (int i = 2; i <input ; i++) {
            if (input%i==0){
                asalsayiMi=false;
                break;
            }


        }
        return asalsayiMi;
    }
}
