public class Main {
    public static void main(String[] args) {
        int amount1 = 13680;//Стоимость билета
        int amount2 = 20;//Количество рублей для одной бонусной мили
        int bonus = amount1 / amount2;//Количество бонусных миль
        System.out.println("Итоговый бонус:" + bonus + " рубля");
    }
}
