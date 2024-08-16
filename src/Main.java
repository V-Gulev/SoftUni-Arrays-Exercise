import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int[] currentRow = new int[rows];
        int[] previousRow = new int[rows];

        for (int i = 0; i < rows; i++) {
            currentRow[0] = 1;

            for (int j = 1; j < i; j++) {
                currentRow[j] = previousRow[j - 1] + previousRow[j];
            }
            currentRow[i] = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(currentRow[j] + " ");
            }
            System.out.println();
            int[] swap = previousRow;
            previousRow = currentRow;
            currentRow = swap;
        }


    }
}
