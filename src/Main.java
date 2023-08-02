import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please, enter length of Fibonacci sequence:");
        Scanner scn = new Scanner(System.in);
        int seqLength = scn.nextInt();
        while (seqLength < 2) {
            System.out.println("Please, enter length more then 2:");
            seqLength = scn.nextInt();
        }
        int[] seq = new int[seqLength];
        seq[0] = 0;
        seq[1] = 1;
        for (int i = 2; i < seqLength; i++) {
            seq[i] = seq[i - 1] + seq[i - 2];
        }
        System.out.println("Fibonacci sequence:");
        for (int number : seq) {
            System.out.print(number + " | ");
        }
    }
}
