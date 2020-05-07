import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        boolean isStopped = false;

        for (int i = 0; !isStopped; i++) {
            for (int j = 0; j < i; j++) {
                count++;
                System.out.print(i + " ");
                if (count == n) {
                    isStopped = true;
                    break;
                }
            }
        }


//        int max = Integer.MIN_VALUE;
//        int count = 0;
//        int number;
//
//        while (count < n) {
//            number = scanner.nextInt();
//            if (number % 4 == 0 && number > max) {
//                max = number;
//            }
//            count++;
//        }
//
//        System.out.println(max);

    }
}