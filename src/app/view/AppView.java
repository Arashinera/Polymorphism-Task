package app.view;

import app.entity.CertainParametres;

import java.util.Scanner;
import java.util.Locale;

public class AppView {

    public CertainParametres getData() {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);
        System.out.println("Welcome to Device Model calculating!\nPlease, enter first parameter value : ");
        double parameterOne = input.nextDouble();
        System.out.println("Please, enter second parameter value :");
        double parameterTwo = input.nextDouble();
        return new CertainParametres(parameterOne, parameterTwo);
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
