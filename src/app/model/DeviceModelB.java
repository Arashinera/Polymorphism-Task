package app.model;

public class DeviceModelB extends DeviceModelBasic {

    public static final double COEFFICIENT = 18.5;

    @Override
    public double calcValue(double parameterOne, double parameterTwo) {
        return (parameterOne + parameterTwo) * COEFFICIENT;
    }
}
