package day21_staticKeyword;

public class C01_StaticBlocks {

    C01_StaticBlocks(){
        System.out.println("Constructor çalıştı");
    }

    public static void main(String[] args) {
        System.out.println("Main method çalışmaya başladı");
    }

    static {
        //static block lar class daki tum yapılardan hatta main method
        //dan bile önce başlar
        //method ların ve static block ların sıralaması Java açısından
        //önemli değildir ancak birden fazla static block varsa kendi aralarında
        //önce üstte olan çalışır
        System.out.println("Static block çalıştı");
    }

    static {

        System.out.println("Alttaki static block çalıştı");
    }
}
