package day11_ForLoops;

public class C04_ForLoop {
    public static void main(String[] args) {
        /*
        eğer for şartı her değer için true ise sonsuz döngü olur
         */

        //input olarak verilen sayıdan bire kadar tum sayıları yazdır

        int input=-23;

        if (input>1){
            for (int i = input; i >= 1; i--) {
                System.out.print(i+" ");

            }
        }else {
            for (int i = input; i <=1 ; i++) {
                System.out.print(i+" ");

            }
        }






    }
}
