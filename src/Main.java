import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numbers = scanner.nextLine();
        String[] symbols = numbers.split(" ");
        int[] array = new int[symbols.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(symbols[i]);
        }

        int totalSum = 0;
        for (int j : array) {
            totalSum += j;
        }

        int leftsum = 0;
        int rightSum;
        boolean isThereAnIndex = true;

        if (array.length == 1 || array.length == 0) {
            System.out.println(0);
            isThereAnIndex= false;
        } else {
            for (int i = 0; i < array.length - 1; i++) {
                rightSum = totalSum - array[i] - leftsum;
                leftsum = totalSum - array[i] - rightSum;
                if (leftsum == rightSum) {
                    System.out.println(i);
                    isThereAnIndex = false;
                    break;
                }
                leftsum += array[i];
            }
        }
        if (isThereAnIndex){
            System.out.println("no");
        }
    }
}
