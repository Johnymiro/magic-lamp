package org.academiadecodigo.stringrays;

public class GrumpyGenie extends Genie {

    public GrumpyGenie(int maxNumOfWishes){
        super(maxNumOfWishes);
    }

    @Override
    public String grantWish(){

        while(super.getMaxNumWishes() > 1){
            super.decrementMaxNumWishes();
        }

        if(super.getMaxNumWishes() == 1){

            super.decrementMaxNumWishes();
            return "Grumpy genie -> " + super.grantWish();
        }

        return "I choose not to grant any more wishes, you are ugly...";

    }
}
