import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int durationInDays = scanner.nextInt();
        int totalFoodCostInDay = scanner.nextInt();
        int oneWayFlightCost = scanner.nextInt();
        int costOfOneNightInHotel = scanner.nextInt();
        int result = 0;
        scanner.close();

        result += durationInDays * totalFoodCostInDay;
        result += oneWayFlightCost * 2;
        result += costOfOneNightInHotel * (durationInDays - 1);

        System.out.println(result);
    }
}