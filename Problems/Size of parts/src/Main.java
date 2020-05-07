import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int larger = 0;
        int smaller = 0;
        int perfect = 0;
        int n = scanner.nextInt();
        int part;

        for (int i = 0; i < n; i++) {
            part = scanner.nextInt();
            switch (part) {
                case 1: larger++; break;
                case -1: smaller++; break;
                case 0: perfect++; break;
            }
        }
        scanner.close();

        System.out.println(perfect + " " + larger + " " + smaller);
    }
}