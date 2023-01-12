package day15_scope_arrays;

public class C01_Hastane {
    static String hastaneismi="Yıldız Hastanesi";
    static String hastaneAdresi="Çankaya/Ankara";

    String personelismi;
    String personelAdresi;
    String personelTel;


    public static void main(String[] args) {

        /*
        eğer tüm methodlardan kullanılabilecek variable lar oluşturmak isterseniz
        bu variable lari class level da oluştururuz

        class level da oluşturulacak variable lar için 2 ihtimal vardır
        1-static variable (class variable)
        2-instance(static olmayan) variable (obje variable)

        kural1-static variable lar tum objeler için tek bir değer alır
               instance variable lar her pbje için java tarafından çoğaltılır
        kural2-class level variable lara değer atamasak da kullanabiliriz
              biz değer atamasak bile java class level variable lara default değerler atar
              non-primitive ===> null (String)
              sayısal primitive ===> 0
              char ===> hiçlik ''
              boolean ===> false
        kural3-static olan methodlardan static olmayan variable ve methodlara direkt ulaşılmaz
              instance variable ve static olamayan methodlari static alanlarda
              kullanmak isterseniz obje uzerinden kullanabilirsiniz
        kural4-class da oluşturulan instance variable lar ilk değer atamasını yapar
              yani bir obje ilk oluşturulduğunda otomatik olarak instance variable a atanan
              değeri alır. deger atanmamışsa default değerleri alır
              obje oluşturulduktan sonra obje üzerinden yapılan atamalar
              class level daki instance variable a değil, Java tarafından oluşturulup
              objeye yapıştırılan kopya variable lara yapılır
         kural5-static variable lar tüm objeler için ortaktır
               static variable lara tüm class dan direkt ulaşılabilir
               static variable ın değeri değişirse tüm objeler için değişmiş olur

         */
        C01_Hastane per1=new C01_Hastane();
        System.out.println(per1.personelismi);// null
        System.out.println(per1.personelAdresi);// null
        System.out.println(per1.personelTel);// null

        per1.personelismi="Fidan";
        per1.personelAdresi="Germany";
        per1.personelTel="+4917112342323";

        C01_Hastane per2=new C01_Hastane();
        System.out.println(per2.personelismi); //null

        per1.personelismi="Yusuf";
        System.out.println(per2.personelismi);
        per2.personelismi="Ayten";
        System.out.println(per2.personelismi);//Ayten
        System.out.println(per1.personelismi);//Yusuf

        System.out.println(hastaneismi);//yıldız hastanesi

        System.out.println(per1.hastaneismi);//yıldız hastanesi

        per2.hastaneismi="Java Hastanesi";

        System.out.println(hastaneismi);//Java hastanesi
        System.out.println(per2.hastaneismi);//java hastanesi
        System.out.println(per1.hastaneismi);//java hastanesi

    }

    public static void method1(){
        System.out.println(hastaneismi);


    }
    public void method2(){
        System.out.println(hastaneismi);
    }
}
