import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Please, enter number to calculate his digits:");
            IntStream numberStr = new Scanner(System.in)
                    .nextLine()
                    .chars()
                    .filter(Character::isDigit)
                    .map(Character::getNumericValue);
            System.out.println("The sum of digits: " + numberStr.sum() + "\n");
        }

    }
}
