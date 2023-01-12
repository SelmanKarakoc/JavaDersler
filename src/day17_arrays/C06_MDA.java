package day17_arrays;

public class C06_MDA {
    public static void main(String[] args) {
        //verilen 2 katlı String bir array de
        //istenen metni içeren elementleri yazdıran
        //bir method oluşturun

        String[][]arr={{"Ali","Zafer"}, {"Betül","Huseyin","Hasan"},{"Said"}};

        String arananMetin="e";
        istenenElementleriYazdir(arr,arananMetin);

    }

    public static void istenenElementleriYazdir(String [][] arr,String arananMetin){

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j].contains(arananMetin)) System.out.print(arr[i][j]+" ");

            }

        }
    }
}
