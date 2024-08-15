import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wagons = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int[] people = new int[wagons];
        for (int i = 0; i < wagons; i++) {
            people[i] = scanner.nextInt();
            sum += people[i];
        }
        for (int person : people) {
            System.out.print(person+" ");
        }
        System.out.println();
        System.out.println(sum);
    }
}

