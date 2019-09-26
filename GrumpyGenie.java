package org.academiadecodigo.stringrays;

public class GrumpyGenie extends Genie {

    private boolean wish1Granted = false;


    public GrumpyGenie(int maxNumOfWishes) {
        super(maxNumOfWishes);
    }

    @Override
    public String grantWish() {

        if(wish1Granted){

            return "Grumpy -> I choose not to grant any more wishes, you are ugly...";
        }

        wish1Granted = true;
        super.decrementMaxNumWishes();

        return "Grumpy genie -> " + super.grantWish();
    }
}
