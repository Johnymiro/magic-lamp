package org.academiadecodigo.stringrays;

public class Genie {

    private int maxNumWishes;
    private int currentWish;


    public Genie(int maxNumWishes){
        this.currentWish = 0;
        this.maxNumWishes = maxNumWishes;
    }



    public String grantWish(){
            currentWish++;
            return "Wish " + String.valueOf(currentWish) + ": Granted.";
    }



    public int getMaxNumWishes(){
       return maxNumWishes;
    }



    public void decrementMaxNumWishes(){
       maxNumWishes--;
    }



    public int getCurrentWish(){
        return this.currentWish;
    }
}
