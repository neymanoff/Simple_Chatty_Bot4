import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean isLeap = false;

        if (year%4 == 0) isLeap = true;
        if (year%100 == 0) isLeap = false;
        if (year%400 == 0) isLeap = true;

        System.out.println(isLeap ? "Leap" : "Regular");
    }
}