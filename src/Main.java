public class Main {
    public static void main(String[] args) {
        int currentBalance = 100;
        int topUp = 1_100;
        int bonus;
        if (topUp > 1_000) {
            bonus = topUp / 100;
        } else {
            bonus = 0;
        }
        currentBalance = currentBalance + topUp + bonus;
        System.out.println("Итоговый бонус: " + bonus);
        System.out.println("Текущий баланс: " + currentBalance);
    }
}
