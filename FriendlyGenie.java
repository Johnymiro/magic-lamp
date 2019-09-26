package org.academiadecodigo.stringrays;

public class FriendlyGenie extends Genie {


    public FriendlyGenie(int maxNumWishes) {
        super(maxNumWishes);

    }

    @Override
    public String grantWish() {


        if (super.getCurrentWish() >= getMaxNumWishes()) {

            return "No more wishes left.";
        }


        return "Friendly genie -> " + super.grantWish();
    }
}
