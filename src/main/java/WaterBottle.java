public class WaterBottle {
    public int volume;

    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public void drink(){
        this.volume -= 10;
    }

    public void empty(){
        this.volume = 0;
    }

    public void fill(){
        this.volume = 100;
    }

    public void printVolume(){
        System.out.println(this.volume);
    }
}
