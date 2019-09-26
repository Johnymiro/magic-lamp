package org.academiadecodigo.stringrays;

public class MagicLamp {

    private int remainingGenenies;
    private int reset = 0;
    private int recharged = 0;


    public MagicLamp(int maxNumOfGenies) {
        this.remainingGenenies = maxNumOfGenies;
    }



    public Genie rub() {

        int numOfwishes = 3;
        int random = rng();

        if (remainingGenenies > 0) {

            remainingGenenies--;
            reset++;

            if (random < 5) {

                return new FriendlyGenie ( numOfwishes );
            }

            return new GrumpyGenie ( numOfwishes );
        }

        if (remainingGenenies == 0) {
            System.out.println("Dude everything you've riched your limit.\n");
        }

        return new RecyclableDemon ( numOfwishes );
    }





    public void recharge(Genie demon) {


        if(!(demon instanceof RecyclableDemon)){
            return;
        }

        RecyclableDemon dem = (RecyclableDemon) demon;

        if(dem.isRecycled()){
            System.out.println("You already recharged with this demon..");
            return;
        }

        recharged++;
        remainingGenenies = reset;
        dem.recycle();
        System.out.println("Recycling successfull. You can call " + remainingGenenies + " more Genies!");
    }



    public boolean compare(MagicLamp lamp) {

        return this.remainingGenenies == lamp.remainingGenenies && this.reset == lamp.reset && this.recharged == lamp.recharged;
    }





    private int rng() {
        return (int) Math.floor(Math.random() * 10);
    }

    public int getMaxNumOfCalls() {

        return remainingGenenies;
    }
    public int getReset() {
        return reset;
    }
}

