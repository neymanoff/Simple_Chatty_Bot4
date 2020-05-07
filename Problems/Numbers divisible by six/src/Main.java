import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            number = scanner.nextInt();
            if (number % 6 == 0) {
                sum += number;
            }
        }

        scanner.close();

        System.out.println(sum);
    }
}