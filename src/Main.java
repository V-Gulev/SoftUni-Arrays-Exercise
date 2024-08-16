import java.util.*;

public class Main {
    public static int[] arrayFromInput(String s) {

        String[] items = s.split(" ");
        int[] numbers = new int[items.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(items[i]);
        }
        return numbers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = arrayFromInput(scanner.nextLine());
        int finalValue = Integer.parseInt(scanner.nextLine());

        int sum;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i+1; j < numbers.length ; j++) {
                sum = numbers[i] + numbers[j];
                if (sum == finalValue) {
                    System.out.println(numbers[i] + " " + numbers[j]);
                }
            }
        }


    }
}
