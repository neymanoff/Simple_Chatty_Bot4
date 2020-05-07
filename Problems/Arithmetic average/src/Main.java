import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        scanner.close();

        int sum = 0;
        int count = 0;
        double result = 0;

        for (; a <= b; a++) {
            if (a % 3 == 0) {
                sum += a;
                count++;
            }
        }
        if (count > 0) {
            result = (double) sum / count;
        }

        System.out.println(result);
    }
}
