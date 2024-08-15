import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        int[] ar = new int[times];
        for (int i = 0; i < times; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            ar[i] = number;
        }
        for (int i = ar.length-1; i >=0 ; i--) {
            System.out.print(ar[i]+" ");
        }
    }
}

