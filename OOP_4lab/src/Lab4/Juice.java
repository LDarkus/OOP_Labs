package Lab4;

public class Juice extends Drinks {
    String fruits;
    Boolean pulp;

    @Override
    public String getInfo() {
        String str="Сок";
        str += "\nФрукт: " + fruits;
        str+="\n"+super.getInfo();
        if (pulp)  str += ("\nМякоть: присутствует");
        else str += ("\nМякоть: отсутствует");
        return  str;
    }

    public Juice(int volume,String fruits, boolean pulp){
        this.fruits=fruits;
        this.pulp=pulp;
        this.volume=volume;
    }
    public Juice(){
        this.fruits="Яблоко";
        this.pulp=true;
        this.volume=10;
    }
}
