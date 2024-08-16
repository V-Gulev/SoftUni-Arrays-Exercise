import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(GetFibonacci(number));
    }

    public static int GetFibonacci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return GetFibonacci(number - 1) + GetFibonacci(number - 2);
    }
}
