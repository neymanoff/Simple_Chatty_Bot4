import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long result = 1;
        scanner.close();

        for (; a < b; a++)
            result *= a;

        System.out.println(result);
    }
}