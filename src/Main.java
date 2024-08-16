import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int bestSampleIndex = 0;
        int bestSum = 0;
        int bestSubLength = 0;
        int bestStartIndex = length;
        String bestSequence = "";
        int sampleIndex = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Clone them!")) {
                break;
            }
            sampleIndex++;
            String[] parts = input.split("!+");
            int[] dnaSequence = new int[length];
            int sum = 0;
            for (int i = 0; i < parts.length; i++) {
                dnaSequence[i] = Integer.parseInt(parts[i]);
                sum += dnaSequence[i];
            }

            int currentSubLength = 0;
            int currentStartIndex = length;
            int maxSubLength = 0;
            int startIndex = 0;

            for (int i = 0; i < dnaSequence.length; i++) {
                if (dnaSequence[i] == 1) {
                    if (currentSubLength == 0) {
                        currentStartIndex = i;
                    }
                    currentSubLength++;
                    if (currentSubLength > maxSubLength) {
                        maxSubLength = currentSubLength;
                        startIndex = currentStartIndex;
                    }
                } else currentSubLength = 0;
            }
            if (maxSubLength > bestSubLength || (maxSubLength == bestSubLength && startIndex < bestStartIndex) || (maxSubLength == bestSubLength && startIndex == bestStartIndex && sum > bestSum)) {
                bestSum = sum;
                bestStartIndex = startIndex;
                bestSampleIndex = sampleIndex;
                bestSubLength = maxSubLength;
                bestSequence = String.join(" ", parts);
            }

        }

        System.out.printf("Best DNA sample %d with sum: %d.%n%s", bestSampleIndex, bestSum, bestSequence);
    }
}
