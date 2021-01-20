public class Main {
    public static void main(String[] args) {
        int CurrentBalance = 100;
        int TopUp = 1_100;
        int Bonus;
        if (TopUp >= 1_100) {
            Bonus = TopUp / 100;
        } else {
            Bonus = 0;
        }
        CurrentBalance = CurrentBalance + TopUp + Bonus;
        System.out.println("Итоговый бонус: " + Bonus);
        System.out.println("Текущий баланс: " + CurrentBalance);
    }
}
