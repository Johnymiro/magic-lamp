package org.academiadecodigo.stringrays;

public class Main {

    public static void main(String[] args) {



        MagicLamp lamp = new MagicLamp(3);
        MagicLamp lamp2 = new MagicLamp(3);


        System.out.println(lamp.compare(lamp2));

        Genie[] genies = new Genie[4];


        for (int i = 0; i < genies.length; i++) {

            genies[i] = lamp.rub();
        }


        printer(6, 0, genies);
        printer(5, 1, genies);
        printer(5, 2, genies);
        printer(5, 3, genies);

        lamp.recharge(genies[genies.length - 1]);


        System.out.println("\n" + genies[3].grantWish() + "\n");

        lamp.recharge(genies[genies.length - 1]);

    }


    private static void printer(int time, int index, Genie[] genie) {
        for (int i = 0; i < time; i++) {

            System.out.println(genie[index].grantWish());
        }
        System.out.println("\n\n");
    }
}
