import java.util.Scanner;

public class InputApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number of books you own: ");
        int books = in.nextInt();
        System.out.printf("Cool! You have %d books", books);
    }
}
