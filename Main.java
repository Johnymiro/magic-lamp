package org.academiadecodigo.stringrays;

public class Main {

    public static void main(String[] args) {



        MagicLamp lamp1 = new MagicLamp(3);

        Genie genie1 = lamp1.enchant();
        Genie genie2 = lamp1.enchant();
        Genie genie3 = lamp1.enchant();
        Genie genie4 = lamp1.enchant();



        System.out.println(genie4.grantWish());














    }
}
