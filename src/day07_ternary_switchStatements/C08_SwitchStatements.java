package day07_ternary_switchStatements;

public class C08_SwitchStatements {
    public static void main(String[] args) {
        //kullanıcıdan iki sayi alın
        //ve kullanıcıya istediği işlemi sorun
        // +,-, *, / işaretlerinden hangisini girerse
        //2 sayi için o işlemi yapın
        //bu işaretlerden birini girmezse
        //"yanlış işlem tercihi" yazdırın

        int sayi1=20;
        int sayi2=12;

        char islem='/';

        // if else ile yapalım

        if (islem=='+'){
            System.out.println("sayıların toplamı= " + (sayi1+sayi2));

        } else if (islem=='-') {
            System.out.println("Sayıların farkı= "+ (sayi1-sayi2));


        } else if (islem=='*') {
            System.out.println("sayıların çarpımı= "+ (sayi1*sayi2));


        } else if (islem=='/') {
            System.out.println("sayıların bölümü= " + (sayi1/sayi2));


        }else System.out.println("yanlış işlem tercihi");



        //switch statement ile yapalım

        switch (islem){
            case '+':
                System.out.println("sayıların toplamı= " + (sayi1+sayi2));
                break;
            case  '-':
                System.out.println("Sayıların farkı= "+ (sayi1-sayi2));
                break;
            case '*':
                System.out.println("sayıların çarpımı= "+ (sayi1*sayi2));
                break;
            case'/':
                System.out.println("sayıların bölümü= " + ((double)sayi1/sayi2));
                break;
            default:
                System.out.println("yanlış işlem tercihi");
        }


    }
}
