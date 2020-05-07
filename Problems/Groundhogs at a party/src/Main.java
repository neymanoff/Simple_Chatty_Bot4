import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        boolean check = false;

        scanner.close();

        if (isWeekend) {
            check = cups >= 15 && cups <= 25;
        } else {
            check = cups >= 10 && cups <= 20;
        }

        System.out.println(check);
    }
}