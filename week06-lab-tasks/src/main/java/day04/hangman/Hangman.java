package day04.hangman;

import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        new Hangman().run();
    }

    private void run() {
        BusinessModel businessModel = new BusinessModel("szarvasmarha", 8);
        Scanner scanner = new Scanner(System.in);
        do {
            printStatus(businessModel);
            String guess = inputGuess(scanner);
            boolean success = businessModel.takeGuess(guess);
            if (success) {
                System.out.println("Jó!");
            } else {
                System.out.println("Rossz!");
            }
        } while (!businessModel.won() && businessModel.hasMoreChance());
        printResult(businessModel);
    }

    private void printResult(BusinessModel businessModel) {
        if (businessModel.won()) {
            System.out.println("Ügyes!");
        } else {
            System.out.println("Vesztettél!");
        }
    }

    private void printStatus(BusinessModel businessModel) {
        System.out.println("Itt tartunk: " + businessModel.getWordFound());
        System.out.println("Ennyi tipped van még: " + businessModel.getChances());
    }

    private String inputGuess(Scanner scanner) {
        System.out.println("Mi a tipped?");
        return scanner.nextLine();
    }

}