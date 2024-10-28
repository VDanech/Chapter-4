public class OperatorApp {
    public static void main(String[] args) {
        int score1 = 10;
        int score2 = 20;
        int score3 = 9;
        int count = 3;

        double average = (score1 + score2 + score3) / (double) count;
        System.out.println(average);
        Math.round(average);
    }

    private static void operations() {
        int a = 10;
        int b = 3;
        System.out.println(a / b);
        System.out.println(a % b); // get the remainder
        double result = a / (double) b; //explicit cast
        System.out.println(result);

        int value = (int) 3.128463 / 3;
        System.out.println(value);
    }
}
