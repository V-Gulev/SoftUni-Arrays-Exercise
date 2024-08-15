import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array1 = scanner.nextLine().split(" ");
        String[] array2 = scanner.nextLine().split(" ");
        common(array1, array2);
    }

    public static void common(String[] array1, String[] array2) {
        Set<String> set1 = new HashSet<>();
        Collections.addAll(set1, array1);

        for (String element : array2) {
            if (set1.contains(element)) {
                System.out.print(element + " ");
            }
        }
    }
}
