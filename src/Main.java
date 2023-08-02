import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please, choose one of this figures and enter the number:\n1.rectangle\n2.triangle\n3.circle");
        Scanner scn = new Scanner(System.in);
        int figuresNumber = scn.nextInt();
        while (figuresNumber > 3 || figuresNumber < 1) {
            System.out.println("Please, choose one of this figures and enter the number:\n1.rectangle\n2.triangle\n3.circle");
            figuresNumber = scn.nextInt();
        }
        switch (figuresNumber) {
            case (1) -> {
                System.out.println("Please, enter the length of the side A of the rectangle:");
                int a = scn.nextInt();
                System.out.println("Please, enter the length of the side B of the rectangle:");
                int b = scn.nextInt();
                System.out.println("Area of the rectangle is " + a * b);
            }
            case (2) -> {
                System.out.println("Please, enter the length of the side A of the triangle:");
                int a = scn.nextInt();
                System.out.println("Please, enter the length of the side B of the triangle:");
                int b = scn.nextInt();
                System.out.println("Please, enter the length of the side C of the triangle:");
                int c = scn.nextInt();
                System.out.println("Area of the triangle is " + 0.5 * (a + b + c));
            }
            case (3) -> {
                System.out.println("Please, enter the length of the radius of the circle:");
                int r = scn.nextInt();
                System.out.println("Area of the circle is " + Math.PI * r * r);
            }
        }
    }
}
