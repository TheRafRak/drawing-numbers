
    import java.util.HashSet;
    import java.util.Random;
    import java.util.Scanner;
    import java.util.Set;

    public class DrawingNumbers {

    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        while (numbers.size() != 6) {

            int number = scanner.nextInt();

            if (number >= 1 && number <= 49) {
                numbers.add(number);
            }
        }

        Random random = new Random();
        int years = 0;
        int days = 0;

        while (true) {
            Set<Integer> randomNumbers = new HashSet<>();

            while (randomNumbers.size() != 6) {
                int randomNumber = random.nextInt(49) + 1;
                randomNumbers.add(randomNumber);
            }

            days++;

            if (randomNumbers.equals(numbers)) {
                break;
            }

            if (days % 365 == 0) {
                years++;
            }
        }

        System.out.println("The numbers drawn are::");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\nThe user would randomly draw the numbers after: " + years + " years and " + (days % 365) + " days");
    }
}