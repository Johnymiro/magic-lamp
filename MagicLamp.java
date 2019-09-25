package org.academiadecodigo.stringrays;

public class MagicLamp {

    private int maxNumOfCalls;
    private int storeNum = maxNumOfCalls;


    public MagicLamp(int maxNumOfGenies){
        this.maxNumOfCalls = maxNumOfGenies;
    }







    public Genie enchant(){


        int random = rng();

        if(maxNumOfCalls > 0) {

            maxNumOfCalls--;
            if (random < 5) {
                Genie friendlyGenie = new FriendlyGenie(3);
                return friendlyGenie;
            }

            Genie grumpyGenie = new GrumpyGenie(3);
            return grumpyGenie;

        }


        RecyclableDemon demon = new RecyclableDemon(3);

        return demon;
    }


    public void recycle(RecyclableDemon demon){

        maxNumOfCalls = storeNum;
        demon.recycle();

    }




    public int getMaxNumOfCalls(){

        return maxNumOfCalls;
    }



    private int rng(){

        return (int) Math.floor(Math.random() *  10);
    }

}

