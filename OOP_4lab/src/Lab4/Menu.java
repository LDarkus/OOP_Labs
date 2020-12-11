package Lab4;

import java.util.Scanner;

public class Menu {

    private static Scanner scanner=new Scanner(System.in);
    public static VendingMachine vm=new VendingMachine();
    public static void start(){
        boolean flag=true;
        int k=10;
        while(k!=0)
        {
            showMenu();
            try {
                k = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Введите заново число");
                continue;
            }
            switch (k) {
                case 1 -> addDrink();


                case 2 -> {
                    vm.getList();
                }
                case 3->{
                    vm.getList();
                    System.out.println("Введите номер напитка, который хотите удалить: ");
                    vm.remove(check());
                }
                case 4->{
                    searchDrinks();
                }
                case 0-> {return;}
                default -> {
                    System.out.println("Такого действия нет");
                }
            }

        }
    }
    public static void searchDrinks()
    {
        showMenuSearch();
        int k=10;
        while(k!=0)
        {
            try {
                k = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Введите заново число");
                continue;
            }
            switch (k) {
                case 1 -> {
                    vm.getJuice();
                    return;
                }

                case 2 -> {
                    vm.getAlcohol();
                    return;
                }
                case 3 ->{
                    vm.getLemonade();
                    return;
                }
                case 0-> {return;}
                default -> {

                }
            }

        }

    }
    public static void addDrink(){
        showMenuDrinks();
        int k=10;
        while(k!=0)
        {
            try {
                k = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Введите заново число");
                continue;
            }
            switch (k) {
                case 1 -> {
                    Juice juice=new Juice();
                    System.out.print("Ввидете название фрукта фрукт: ");
                    juice.fruits=scanner.nextLine();
                    System.out.print("Введите объем: ");
                    juice.volume=check();
                    System.out.println("Выбирите присутствует мякоть или нет   \n1)Да   \n2)Нет");
                    juice.pulp= check(1,2)==1;
                    System.out.println("Данныый напиток был добавлен в автомат");
                    vm.add(juice);
                    return;
                }

                case 2 -> {
                    Lemonade lemonade=new Lemonade();
                    System.out.print("Ввидете название газировки: ");
                    lemonade.lemonedeType=scanner.nextLine();
                    System.out.print("\nВведите объем: ");
                    lemonade.volume=check();
                    System.out.println("\nВыбирите концентрацию газов   1)сильногазированная   2)слабогазированная");
                    if(check(1,2)==1)
                        lemonade.bubbles="сильногазированный";
                    else lemonade.bubbles="слабогазированный";
                    System.out.println("Данныый напиток был добавлен в автомат");
                    vm.add(lemonade);
                    return;
                }
                case 3 ->{
                    Alcohol alcohol=new Alcohol();
                    System.out.print("Ввидете название алкоголя: ");
                    alcohol.alcoholType=scanner.nextLine();
                    System.out.print("\nВведите объем: ");
                    alcohol.volume=check();
                    System.out.print("\nВведите крепкость: ");
                    alcohol.strength =check();
                    System.out.println("Данныый напиток был добавлен в автомат");
                    vm.add(alcohol);
                    return;
                }
                case 0-> {return;}
                default -> {
                    System.out.println("Такой категории");
                    showMenuDrinks();
                }
            }

        }

    }
    public  static  int check(int start, int end)
    {
        while (true) {
            try {
                int k = Integer.parseInt(scanner.nextLine());
                if (k == 1 || k == 2)
                    return k;
            } catch (NumberFormatException e) {
                System.out.println("Введите число");
                continue;
            }
            System.out.println("Введите число в диапазоне от "+start+" до "+end);
        }
    }
    public static int check()
    {

        while (true) {
            try {
                int k = Integer.parseInt(scanner.nextLine());
                return k;
            } catch (NumberFormatException e) {
                System.out.println("Введите число");
            }
        }
    }
    public static void showMenu()
    {
        System.out.println("\nВыбирите дейтсвие которое хотите сделать");
        System.out.println("------------------------------------------");
        System.out.println("1)Добавить напиток");
        System.out.println("2)Просмотреть все напитки");
        System.out.println("3)Удалить напиток");
        System.out.println("4)Поиск напитка");
        System.out.println("0)Выход");
    }
    public static void showMenuDrinks()
    {
        System.out.println("\nВыбирите категорию напитков которую хотите добавить");
        System.out.println("----------------------------------------------------");
        System.out.println("1)Добавить сок");
        System.out.println("2)Добавить газировку");
        System.out.println("3)Добавить алкоголь");
        System.out.println("0)Назад");
    }
    public static void showMenuSearch()
    {
        System.out.println("Выбирете параметры поиска");
        System.out.println("--------------------------");
        System.out.println("1)Вывести все соки");
        System.out.println("2)Вывести все алкогольные напитки");
        System.out.println("3)Вывести все газированные напитки");
        System.out.println("0)Назад");
    }
}

