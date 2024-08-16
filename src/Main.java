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


        while (array.length>1) {
            int[] condensed = new int[array.length - 1];
            for (int i = 0; i < array.length - 1; i++) {
                condensed[i] = array[i] + array[i + 1];
            }
            array = condensed;
        }

        System.out.println(array[0]);
    }
}
