import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean isA = b + c > a;
        boolean isB = a + c > b;
        boolean isC = b + a > c;

        if (isA && isB && isC)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}