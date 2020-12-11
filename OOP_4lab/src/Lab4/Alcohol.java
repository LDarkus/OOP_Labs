package Lab4;

public class Alcohol extends Drinks {
    int strength;
    String alcoholType;

    @Override
    public String getInfo() {
        String str="Алкоголь";
        str += "\nТип: " + alcoholType;
        str+="\n"+super.getInfo();
        str +="\nКрепость: "+ strength +"%";
        return  str;
    }

    public Alcohol(int volume,String alcoholType,int strength){
        this.alcoholType=alcoholType;
        this.strength =strength;
        this.volume=volume;
    }
    public Alcohol(){
        this.alcoholType="Водка";
        this.strength =40;
        this.volume=10;
    }
}
