import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int n = scanner.nextInt();
        int grade;

        for (int i = 0; i < n; i++) {
            grade = scanner.nextInt();

            switch (grade) {
                case 2: d++; break;
                case 3: c++; break;
                case 4: b++; break;
                case 5: a++; break;
            }
        }
        scanner.close();

        System.out.println(d + " " + c + " " + b + " " + a);
    }
}