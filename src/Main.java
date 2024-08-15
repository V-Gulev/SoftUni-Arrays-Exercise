import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rotations = Integer.parseInt(scanner.nextLine());
        firstArray = rotate(firstArray, rotations);
        for (int j : firstArray) {
            System.out.print(j + " ");
        }
    }

    public static int[] rotate(int[] array, int rotations) {
        int n = array.length;
        int[] rotatedArray = new int[n];
        for (int i = 0; i < n; i++) {
            rotatedArray[i] = array[(i + rotations) % n];
        }
        return rotatedArray;
    }
}
