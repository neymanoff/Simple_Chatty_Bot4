import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ints = new int[3];
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            ints[i] = scanner.nextInt();
        }

        for (int i: ints)
            if (i > 0)
                count++;

        System.out.println(count == 1);
    }
}