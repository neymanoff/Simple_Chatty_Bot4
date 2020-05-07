import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int n = scanner.nextInt();
        int number;

        for (int i = 0; i < n; i++) {
            number = scanner.nextInt();
            if (number % 4 == 0 && number > max){
                max = number;
            }
        }

        System.out.println(max);

    }
}