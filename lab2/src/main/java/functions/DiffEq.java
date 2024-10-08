package functions;

import java.util.function.BiFunction;

public class DifferentialEquations {

    private final BiFunction<Double, Double, Double> function;

    public DifferentialEquations(BiFunction<Double, Double, Double> function) {
        this.function = function;
    }

    public double getValues(double x, double y) {
        return function.apply(x, y);
    }
}