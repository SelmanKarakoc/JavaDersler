package day10__stringManipulations;

public class C11_ForLoop {
    public static void main(String[] args) {
        // verilen sayinin faktoriyelini hesapla

        int input=6;
        int carpim=1;
        for (int i = input; i >=1 ; i--) {
            carpim*=i;


        }
        System.out.println("verilen"+ input + "sayının faktoriyeli: "+ carpim);
    }
}
