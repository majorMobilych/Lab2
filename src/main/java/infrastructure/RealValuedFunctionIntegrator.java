package infrastructure;

public interface RealValuedFunctionIntegrator {

    double integrate(int iterations, RealValuedFunction function, double integrateFrom, double integrateTo);

    double integrate(double accuracy, RealValuedFunction function, double integrateFrom, double integrateTo);
}
