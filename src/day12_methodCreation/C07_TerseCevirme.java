package day12_methodCreation;

public class C07_TerseCevirme {
    public static void main(String[] args) {
        //verilen bir String i terse çevirip o halini bize
        //donduren bir method oluştur

        String str="Java candir";

        System.out.println(metniTerseCevir(str));


    }
    public static String metniTerseCevir(String str){

        String tersStr="";

        for (int i = str.length()-1; i >= 0; i--) {

            tersStr+=str.charAt(i);


        }

        return tersStr;


    }


}
