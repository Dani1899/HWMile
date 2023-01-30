public class Main {
    public static void main(String[] args) {
        int ticketCost = 13680;//Стоимость билета
        int costForOneMile = 20;//Количество рублей для одной бонусной мили
        int bonus = ticketCost / costForOneMile;//Количество бонусных миль
        System.out.println("Итоговый бонус:" + bonus + " рубля");
    }
}
