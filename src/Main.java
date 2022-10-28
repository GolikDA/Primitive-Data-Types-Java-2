public class Main {
    public static void main(String[] args) {
        int ticket = 50_001;
        int rubleToMileRatio = 20 / 1;
        int bonus = ticket / rubleToMileRatio;
        System.out.println("Бонусных миль: " + bonus);
    }
}