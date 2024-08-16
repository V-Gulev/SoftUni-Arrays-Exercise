import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int[] allSums = new int[number];
        for (int i = 0; i < number; i++) {
            String name = scanner.nextLine();
            int sum = 0;
            for (int j = 0; j < name.length(); j++) {
                char index = name.charAt(j);
                if (index == 'A' || index == 'E' || index == 'I' || index == 'O' || index == 'U' || index == 'a' || index == 'e' || index == 'i' || index == 'o' || index == 'u') {
                    sum += index * name.length();
                } else {
                    sum += index / name.length();
                }
            }
            allSums[i] = sum;
        }
        Arrays.sort(allSums);
        for (int k : allSums) {
            System.out.println(k + " ");
        }
    }
}
