package app.model;

public class DeviceModelA extends DeviceModelBasic {

    @Override
    public double calcValue(double parameterOne, double parameterTwo) {
        return parameterOne * parameterTwo;
    }

}
