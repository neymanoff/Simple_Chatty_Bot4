import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean check = false;

        if (number > -15 && number <=12) check = true;
        else if (number > 14 && number < 17) check = true;
        else if (number >= 19) check = true;

        System.out.println(check ? "True" : "False");
    }
}