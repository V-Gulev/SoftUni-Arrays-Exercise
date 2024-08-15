import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean check = false;
        int sum1;
        int sum2;
        int totalSum = 0;
        int maxLength = Math.max(firstArray.length, secondArray.length);
        for (int i = 0; i < maxLength; i++) {
            sum1 = firstArray[i];
            sum2 = secondArray[i];
            totalSum += firstArray[i];
            if (sum1 != sum2) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                check = false;
                break;
            }else check=true;
        }
        if (check) {
            System.out.printf("Arrays are identical. Sum: %d", totalSum);
        }

    }
}

