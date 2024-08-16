import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stringNumbers = scanner.nextLine().split(" ");
        int[] array = new int[stringNumbers.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(stringNumbers[i]);
        }
        int maxLISLength = 0;
        int index = 0;
        if (array.length == 1) {
            System.out.println(array.length);
        } else {
            int[] len = new int[array.length];
            int[] prev = new int[array.length];

            for (int i = 0; i < array.length; i++) {
                len[i] = 1;
                prev[i] = -1;

                for (int j = 0; j < i; j++) {
                    if (array[j] < array[i] && len[j] + 1 > len[i]) {
                        len[i] = len[j] + 1;
                        prev[i] = j;
                    }
                }
                if (len[i] > maxLISLength) {
                    maxLISLength = len[i];
                    index = i;
                }
            }
            int[] longestIncreasingSequence = new int[maxLISLength];
            int resultIndex = maxLISLength - 1;
            while (index != -1) {
                longestIncreasingSequence[resultIndex] = array[index];
                index = prev[index];
                resultIndex--;
            }
            for (int j : longestIncreasingSequence) {
                System.out.print(j + " ");
            }
        }
    }
}
