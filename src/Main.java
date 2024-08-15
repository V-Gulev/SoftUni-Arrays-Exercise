import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] chars = input.split(" ");
        reversed(chars);
        for (String aChar : chars) {
            System.out.print(aChar);
            System.out.print(" ");
        }
    }

    private static void reversed(String[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            String a = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = a;
        }
    }
}
