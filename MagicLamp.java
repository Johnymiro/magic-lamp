package org.academiadecodigo.stringrays;

public class MagicLamp {

    private int maxNumOfGenies;
    private int reset = 0;

    public MagicLamp(int maxNumOfGenies){
        this.maxNumOfGenies = maxNumOfGenies;
    }


    public Genie enchant(){


        int random = rng();

        if(maxNumOfGenies > 0) {

            maxNumOfGenies--;
            reset++;

            if (random < 5) {
                Genie friendlyGenie = new FriendlyGenie(3);
                return friendlyGenie;
            }

            Genie grumpyGenie = new GrumpyGenie(3);
            return grumpyGenie;
        }

        if(maxNumOfGenies == 0){
            System.out.println("Dude everything you've riched your limit.\n");
        }

        RecyclableDemon demonGenie = new RecyclableDemon(3);
        return demonGenie;
    }


    public void recycle(Genie demon){

        maxNumOfGenies = reset;
        demon.recycle();
        System.out.println("Recycling successfull. You can call " + maxNumOfGenies + " more Genies!");
    }




    public int getMaxNumOfCalls(){

        return maxNumOfGenies;
    }


    public int getReset(){
        return reset;
    }


    private int rng(){
        return (int) Math.floor(Math.random() *  10);
    }
}

