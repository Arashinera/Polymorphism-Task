package app.controller;

import app.model.DeviceModelA;
import app.model.DeviceModelB;
import app.entity.CertainParametres;
import app.utils.Rounder;
import app.view.AppView;

//Імпортуємо статичний коефіцієнт :
import static app.model.DeviceModelB.COEFFICIENT;

public class AppController {

    public void getResultA() {
        AppView view = new AppView();
        DeviceModelA model = new DeviceModelA();
        CertainParametres certainParametres = view.getData();
        double paramOne = certainParametres.parameterOne();
        double paramTwo = certainParametres.parameterTwo();
        String resultA = Rounder.roundValue(model.calcValue(paramOne, paramTwo));
        String output = "Device A value result is : " + paramOne + " * " + paramTwo + " = " + resultA;
        view.getOutput(output);
    }

    public void getResultB() {
        AppView view = new AppView();
        DeviceModelB model = new DeviceModelB();
        CertainParametres certainParametres = view.getData();
        double paramOne = certainParametres.parameterOne();
        double paramTwo = certainParametres.parameterTwo();
        String resultB = Rounder.roundValue(model.calcValue(paramOne, paramTwo));
        String output = "Device B value result is : " + paramOne + " + " + paramTwo + " * " + COEFFICIENT + " = " + resultB;
        view.getOutput(output);
    }

}
