import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        topInts(array);
    }

    public static void topInts(int[] array) {
        int n = array.length;
        List<Integer> topIntegers = new ArrayList<>();
        int maxFromRight = array[n - 1];
        topIntegers.add(maxFromRight);
        for (int i = n - 2; i >= 0; i--) {
            if (array[i] > maxFromRight) {
                maxFromRight = array[i];
                topIntegers.add(maxFromRight);
            }
        }
        Collections.reverse(topIntegers);
        for (int top : topIntegers) {
            System.out.print(top + " ");
        }
    }
}
