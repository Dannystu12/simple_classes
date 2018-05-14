public class WaterBottle {
    private int volume;

    public WaterBottle(){
        fill();
    }

    public int getVolume(){
        return volume;
    }

    public void empty(){
        volume = 0;
    }

    public void fill(){
        volume = 100;
    }

    public void drink(){
        if(volume >= 10){
            volume -= 10;
        }
    }

}
