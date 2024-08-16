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


        while (true) {
            String command = scanner.nextLine();
            if (command.equals("end")) {
                break;
            }
            String[] action = command.split(" ");

            switch (action[0]) {
                case "swap":
                    int index1 = Integer.parseInt(action[1]);
                    int index2 = Integer.parseInt(action[2]);
                    int swapper = numbers[index1];
                    numbers[index1] = numbers[index2];
                    numbers[index2] = swapper;
                    break;
                case "multiply":
                    index1 = Integer.parseInt(action[1]);
                    index2 = Integer.parseInt(action[2]);
                    numbers[index1] = numbers[index1] * numbers[index2];
                    break;
                case "decrease":
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i]=numbers[i]-1;
                    }
                    break;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
