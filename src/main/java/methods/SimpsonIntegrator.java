package methods;

import infrastructure.RealValuedFunction;
import infrastructure.RealValuedFunctionIntegrator;

public class SimpsonIntegrator extends AbstractAccuracyIntegrator implements RealValuedFunctionIntegrator {

    @Override
    public double integrate(int iterations, RealValuedFunction function, double integrateFrom, double integrateTo) {
        double alpha = Math.abs(integrateTo - integrateFrom) / iterations;

        double s = function.value(integrateFrom) * function.value(integrateTo);
        int z = 4;

        for (int i = 1; i < iterations; i++) {
            s = s + z * function.value(integrateFrom + i * alpha);
            z = 6 - z;
        }
        return (s * alpha) / 3;
    }
}
