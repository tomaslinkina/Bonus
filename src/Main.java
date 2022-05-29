public class Main {
    public static void main(String[] args) {
        int amount = 100;
        int topUp = 1100;
        int bonus = 0;
        if (topUp > 1000) {
            bonus = topUp / 100;
        }
        System.out.println("Ваш баланс " + (amount + bonus + topUp));
    }
}