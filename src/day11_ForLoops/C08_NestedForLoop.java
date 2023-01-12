package day11_ForLoops;

public class C08_NestedForLoop {
    public static void main(String[] args) {
        int input=4;
        /*
        1 2 3 4
        2 4 6 8
        3 6 9 12
        4 8 12 16
         */
        
        //1 2 3 4
        for (int i = 1; i <=4 ; i++) { //outer loop denir vei nin çarpılacağı sayıyı kontrol edecek

            for (int j = 1; j <=4 ; j++) { //inner loop denir ve önceki örnekteki i değişkenini kontrol eder

                System.out.print(i*j+" ");

            }
            System.out.println("");

        }









    }
}
