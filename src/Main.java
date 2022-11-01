import src.BonusMilesService;

public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int cost = 30000;
        int miles = service.calculate(cost);
        System.out.println("За перелет из Санкт-Петербурга в Воронеж начислено " + miles + " миль");

        System.out.println();
        cost = 22500;
        miles = service.calculate(cost);
        System.out.println("За перелет из Москвы в Санкт-Петербург начислено " + miles + " миль");
    }
}
