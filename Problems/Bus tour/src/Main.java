import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();
        int heightOfBridge;
        boolean willCrash = false;

        for (int i = 1; i <= numberOfBridges; i++) {
            heightOfBridge = scanner.nextInt();
            if (heightOfBridge <= height) {
                System.out.println(String.format("Will crash on bridge %d", i));
                willCrash = true;
                break;
            }
        }
        if (!willCrash) {
            System.out.println("Will not crash");
        }
    }
}