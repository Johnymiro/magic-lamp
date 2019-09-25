package org.academiadecodigo.stringrays;

public class Main {

    public static void main(String[] args) {

        int num = 3;

        MagicLamp lamp = new MagicLamp(3);

        Genie[] genies = new Genie[4];

        for(int i = 0; i < genies.length; i++){

            genies[i] = lamp.enchant();
        }


        printer(4, 0, genies);
        printer(4,1, genies);
        printer(4,2, genies);
        printer(4,3, genies);

        lamp.recycle(genies[genies.length - 1]);


    }

    private static void printer(int time, int index, Genie[] genie){
        for(int i = 0; i < time; i++){

            System.out.println(genie[index].grantWish());
        }
        System.out.println("\n\n");
    }
}
