import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        double p = scanner.nextDouble();
        double k = scanner.nextDouble();
        int count = 0;
        scanner.close();

        while(k > m) {
            if (k == m) break;
            m += m * p / 100;
            count++;
        }


        System.out.println(count);
    }
}