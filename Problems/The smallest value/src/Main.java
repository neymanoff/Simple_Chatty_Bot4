import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long m = scanner.nextLong();

        int factorial = 1;
        long result = 1;

        do {
            factorial++;
            result *= factorial;
        } while (result <= m);

        System.out.println(factorial);
    }
}