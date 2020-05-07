import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int number;
        boolean isAscending = true;
        boolean isDescending = true;

        while (true){
            number = scanner.nextInt();
            if (number == 0) break;
            list.add(number);
        }

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i-1) < list.get(i)) {
                isDescending = false;
                break;
            }
        }
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i-1) > list.get(i)) {
                isAscending = false;
                break;
            }
        }

        System.out.println(isAscending || isDescending);
    }
}