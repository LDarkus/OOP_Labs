package Lab4;

public abstract class Drinks {
    int volume;
    public  String getInfo()
    {
        String str="Объем: "+volume;
        return str;
    }
    //public abstract String getInfo();


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}
