import java.util.*;

public class Main {
    public static int[] arrayFromInput(String s) {

        String[] items = s.split(" ");
        int[] numbers = new int[items.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(items[i]);
        }
        return numbers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleWaitingToGetOn = Integer.parseInt(scanner.nextLine());
        int[] numbers = arrayFromInput(scanner.nextLine());
        int adder;

        for (int i = 0; i < numbers.length; i++) {
            if (peopleWaitingToGetOn >= 4) {
                adder = 4 - numbers[i];
                numbers[i] += adder;
                peopleWaitingToGetOn -= adder;
            } else if (peopleWaitingToGetOn > 0) {
                adder = 4 - numbers[i];
                if (adder>=peopleWaitingToGetOn){
                    numbers[i] += peopleWaitingToGetOn;
                    peopleWaitingToGetOn = 0;
                }else {
                    numbers[i] += adder;
                    peopleWaitingToGetOn-=adder;
                }
            }
        }
        if (peopleWaitingToGetOn > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!", peopleWaitingToGetOn);
            System.out.println();
            for (int j : numbers) {
                System.out.print(j + " ");
            }
        } else if (numbers[numbers.length - 1] == 4) {
            for (int j : numbers) {
                System.out.print(j + " ");
            }
        } else {
            System.out.println("The lift has empty spots!");
            for (int j : numbers) {
                System.out.print(j + " ");
            }
        }

    }
}
