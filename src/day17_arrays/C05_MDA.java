package day17_arrays;

public class C05_MDA {
    public static void main(String[] args) {
        int[][] arr={{1,2},{3,4,5},{6,7,4,5},{2},{1,2,3,4,5}};

        //verilen 2 katlı MDA daki tum sayıların toplamını yazdıran bir method oluşturun

tumSayilariTopla(arr);






    }

    public static void tumSayilariTopla(int [][] arr){
        int toplam=0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                toplam+=arr[i][j];

                
            }

        }

        System.out.println("Array deki tüm sayıların toplamı= "+toplam);
    }


}
