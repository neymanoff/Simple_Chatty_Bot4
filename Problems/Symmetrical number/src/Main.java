import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean check = false;
        scanner.close();

        int[] ints = new int[4];

        for (int i = 0; i < 4; i++) {
            ints[i] = number % 10;
            number /= 10;
        }

        if (ints[0] == ints[3] && ints[1] == ints[2])
            check = true;

        System.out.println(check ? 1 : (int) (Math.random() * 100));


    }
}