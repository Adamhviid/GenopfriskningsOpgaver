import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // grass grows 0.8cm every day in summer
        // the grass max length should be below 10cm

        double max = 10.00;
        Scanner scanner = new Scanner(System.in);

        System.out.println("How tall is your grass (cm):");
        double current = scanner.nextDouble();

        WhenShouldiCutTheGrass(current, max);

    }
    public static void WhenShouldiCutTheGrass ( double current, double max) {

        double CutWhen = Math.round(max/current);
        if (current >= max) {
            System.out.println("Cut your grass, mate");

        } else {
            System.out.println("Cut the grass in: " + CutWhen + " day(s).");
        }

        return;
    }
}
