package day09_stringManipulation;

public class C02_contains {
    public static void main(String[] args) {


        String str="Java öğren, mutlu ol";

        //str mutlu içeriyor mu?

        System.out.println(str.contains("mutlu"));

        //charSequence: char dizisi

        System.out.println(str.contains("j"));
        System.out.println(str.contains(" "));

        //contains methotu kaç tane olduğuna değil sadece var olup olmadığına bakar

        System.out.println(str.length());



    }
}
