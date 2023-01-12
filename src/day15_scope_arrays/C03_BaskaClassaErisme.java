package day15_scope_arrays;

public class C03_BaskaClassaErisme {
    public static void main(String[] args) {

        System.out.println(C01_Hastane.hastaneismi);
        C01_Hastane.method1();
        System.out.println(C01_Hastane.hastaneAdresi);

        C01_Hastane per1=new C01_Hastane();

        per1.personelismi="Selman";
        per1.personelAdresi="İzmir";
        per1.hastaneAdresi="Uskudar";

        System.out.println(per1.personelismi);
        System.out.println(per1.personelAdresi);
        System.out.println(per1.hastaneAdresi);
        System.out.println(per1.hastaneismi);

    }
}
