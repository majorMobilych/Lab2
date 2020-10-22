package methods;

import infrastructure.RealValuedFunction;
import infrastructure.RealValuedFunctionIntegrator;

public abstract class AbstractAccuracyIntegrator implements RealValuedFunctionIntegrator {

    @Override
    public double integrate(double accuracy, RealValuedFunction function, double integrateFrom, double integrateTo) {
        int counter = 1;
        while(
                Math.abs(
                        integrate(counter, function, integrateFrom, integrateTo)
                        -
                        integrate(counter + 1, function, integrateFrom, integrateTo))
                        >
                        accuracy
        ) {
            counter++;
        }
        return integrate(counter + 1, function, integrateFrom, integrateTo);
    }
}
