import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please, enter three-digit number:");
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        while (number > 999 || number < 100) {
            System.out.println("Please, enter three-digit number:");
            number = scn.nextInt();
        }
        IntStream numberStr = Integer.toString(number).chars().map(Character::getNumericValue);
        System.out.println("The sum of digits: " + numberStr.sum());
    }
}
