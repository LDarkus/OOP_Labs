package Lab4;

public class Lemonade extends Drinks {
    String lemonedeType;
    String bubbles;

    @Override
    public String getInfo() {
        String str="Газировка";
        str += "\nТип: " + lemonedeType;
        str+="\n"+super.getInfo();
        //str+="\nОбъем: "+getVolume();
        str+="\nКонцентрация газов: "+bubbles;
        return  str;
    }
    public Lemonade(int volume,String lemonedeType, String bubbles)
    {
        this.volume=volume;
        this.lemonedeType = lemonedeType;
        this.bubbles=bubbles;
    }
    public Lemonade()
    {
        this.volume=10;
        this.lemonedeType = "Кола";
        this.bubbles="Сильногазированная";
    }
}
