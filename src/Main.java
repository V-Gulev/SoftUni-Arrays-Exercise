import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] red = new int[n];
        int[] blue = new int[n];
        for (int i = 0; i < n; i++) {
            int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (i % 2 == 0) {
                red[i] = array[0];
                blue[i] = array[1];
            } else {
                red[i] = array[1];
                blue[i] = array[0];
            }
        }

        for (int j : red) {
            System.out.print(j+" ");
        }
        System.out.println();
        for (int j : blue) {
            System.out.print(j+" ");
        }
    }
}
