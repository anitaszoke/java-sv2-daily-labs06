package day01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PositiveNumberContainer positiveNumber = new PositiveNumberContainer();
        Scanner scanner = new Scanner(System.in);

        double answer;
        do {
            System.out.println("Kérem adjon meg egy számot: ");
            answer = scanner.nextInt();
            if (answer > 0) {
                positiveNumber.addNumber(answer);
            }
        } while (answer > 0);

        System.out.println(positiveNumber.getNumberList());
    }
}
