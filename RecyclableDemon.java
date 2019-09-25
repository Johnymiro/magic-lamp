package org.academiadecodigo.stringrays;

public class RecyclableDemon extends Genie{

    public String name = "Demon";
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



    @Override
    public void recycle(){

        this.recycled = true;
    }

    public boolean isRecycled() {
        return recycled;
    }
}
