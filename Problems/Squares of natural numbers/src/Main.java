import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 1;

       do {
            System.out.println(count * count);
            count++;
        }  while (count * count <= n);
    }
}