package day11_ForLoops;

public class C11_NestedLoop {
    public static void main(String[] args) {
        /*
        *
        * *
        * * *
        * * * *
        * * *
        * *
        *

         */
        int input=4;

        for (int i = 1; i <= input; i++) {

            System.out.println("");
            for (int j = 1; j <= i; j++) {

                System.out.print("* ");


            }

        }

        for (int i = input-1; i >=1 ; i--) {
            System.out.println("");
            for (int j = 0; j < i; j++) {

                System.out.print("* ");

            }

        }




















    }
}
