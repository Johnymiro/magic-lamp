package org.academiadecodigo.stringrays;

public class FriendlyGenie extends Genie{




    public FriendlyGenie(int maxNumWishes){
        super(maxNumWishes);

    }

    @Override
    public String grantWish(){

        if(super.getMaxNumWishes() > 0){

            super.decrementMaxNumWishes();

            return "Friendly genie -> " +  super.grantWish();
        }

        return "No more wishes left";
    }

}
