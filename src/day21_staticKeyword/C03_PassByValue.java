package day21_staticKeyword;

public class C03_PassByValue {
    public static void main(String[] args) {

        int s=20;

        System.out.println(s);

        //int s=30;
        //bir scope da tanımlanan variable ın yeniden tanımlama imkanı yoktur

        //String s="Hasan";
        //data turunu değiştirerek yeniden tanımlamak da mumkun değildir
method();
    }

    public static void method(){
        method2(5);
        String s="Hasan";

        System.out.println(s.toUpperCase());// HASAN


    }

    public static void method2(int s){
        s=s*s;
        System.out.println(s);
    }
}
