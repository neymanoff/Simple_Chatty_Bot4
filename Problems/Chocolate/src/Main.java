import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        boolean check = false;

        if ((k % n == 0 || k % m == 0) && k < n * m)
            check = true;

        System.out.println(check ? "YES" : "NO");
    }
}