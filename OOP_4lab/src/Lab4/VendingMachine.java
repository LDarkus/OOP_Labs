package Lab4;

import java.util.ArrayList;

public class VendingMachine {
    private ArrayList<Drinks> drinks=new ArrayList<>();

    public VendingMachine(ArrayList<Drinks> drinks)
    {
        this.drinks=drinks;
    }

    public void getList()
    {
        for (int i = 0; i < drinks.size(); i++) {
            System.out.println();
            System.out.print(i + 1 + ")");
            System.out.println("\n" + drinks.get(i).getInfo());
        }
    }
    public  void getJuice()
    {
        int k=0;//Счетчик колличества соков в списке
        for (int i = 0; i < drinks.size(); i++) {
            if(drinks.get(i) instanceof Juice) {
                System.out.println(k+1+")");
                System.out.println(drinks.get(i).getInfo());
                k++;
            }

        }
        if(k==0)
            System.out.println("В автомате не было найдено ни одного напитка данной категории");
    }
    public  void getLemonade()
    {
        int k=0;//Счетчик колличества соков в списке
        for (int i = 0; i < drinks.size(); i++) {
            if(drinks.get(i) instanceof Lemonade) {
                System.out.println(k+1+")");
                System.out.println(drinks.get(i).getInfo());
                k++;
            }
        }
        if(k==0)
            System.out.println("В автомате не было найдено ни одного напитка данной категории");
    }
    public  void getAlcohol()
    {
        int k=0;//Счетчик колличества соков в списке
        for (int i = 0; i < drinks.size(); i++) {
            if(drinks.get(i) instanceof Alcohol) {
                System.out.println(k+1+")");
                System.out.println(drinks.get(i).getInfo());
                k++;
            }
        }
        if(k==0)
            System.out.println("В автомате не было найдено ни одного напитка данной категории");
    }
    public VendingMachine()
    {
        Drinks drinks1=new Lemonade(10,"Кола","Сильногазированная");
        drinks.add(drinks1);
        Drinks drinks2=new Alcohol(10,"Водка",40);
        drinks.add(drinks2);
        Drinks drinks3=new Juice(10,"Яблоко",true);
        drinks.add(drinks3);

    }
    public void add(Drinks drink) {
        this.drinks.add(drink);
    }


    public void remove(int i) {
        try {
            this.drinks.remove(i - 1);
        }
        catch (IndexOutOfBoundsException e){
        System.out.println("Такого напитка нет");}
    }
}
