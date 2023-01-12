package tes;

public class day05_q2_menu {
    public static void main(String[] args) {
        // create 2D array of food:
        // print all the foods sorted

        // american
        //----------
        // italian
        //----------
        // asian
        //----------
        // afghani
        //----------
        // indian

        String[][] food = {{"steak", "hot dog", "cheeseburger"}, {"pizza", "pasta", "canoli"},
                {"sushi", "ramen", "fried rice", "dumplings"}, {"kebab", "manto"},
                {"beriyani", "masal", "curry", "chicken tikka masala"}};

        for (String[] ulkerler:food) {
            for (String yemekler:ulkerler) {
                System.out.println(yemekler);

            }
            System.out.println("----------------------");
        }
        System.out.println("=====For i Çözümü=======");

        String[] ulkeler={"american","italian","asian", "afghani","indian",};

        for (int i = 0; i < food.length; i++) {

            System.out.println("-------- "+ulkeler[i]+" ----------");

            for (int j = 0; j <food[i].length ; j++) {

                System.out.println(food[i][j]);

            }


        }




            }
            
        }



