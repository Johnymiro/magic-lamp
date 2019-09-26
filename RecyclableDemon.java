package org.academiadecodigo.stringrays;

public class RecyclableDemon extends Genie{

    private boolean recycled = false;

    public RecyclableDemon(int maxNumOfWishes){

        super(maxNumOfWishes);
    }


    @Override
    public String grantWish(){

        if(!recycled){
            return "Demon genie -> " + super.grantWish();
        }

        return "Dude you just recycled me, Good bye...";
    }






    public void recycle(){

        this.recycled = true;
    }

    public boolean isRecycled() {
        return recycled;
    }
}
