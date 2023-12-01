package app;

import app.controller.AppController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        runChoice(getChoice());
    }

    private static int getChoice() {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------\n"
                + "Choose opinion :\n1 - Calculate Model Device A\n2 - Calculate Model Device B"
                + "\n-------------------");
        choice = input.nextInt();
        return choice;
    }

    private static void runChoice(int option) {
        switch (option) {
            case 1 -> {
                AppController controller = new AppController();
                controller.getResultA();
            }
            case 2 -> {
                AppController controller = new AppController();
                controller.getResultB();
            }
            default -> System.out.println("No such option.");
        }
    }
}
