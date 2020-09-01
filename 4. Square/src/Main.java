import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Size of the square:");
        int number = scanner.nextInt();

        makeSquare(number);
    }

    public static void makeSquare ( int number ) {

        for (int i = 1; i <= number; i++) {

            for (int y = 1; y < number; y++) {
                System.out.print("*");
            }

            System.out.println("*");
        }
        return;
    }
}
