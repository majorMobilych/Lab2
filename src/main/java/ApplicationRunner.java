import infrastructure.RealValuedFunction;
import infrastructure.RealValuedFunctionIntegrator;
import methods.*;

public class ApplicationRunner {

    public static void main(String[] args) {
        RealValuedFunction function = x -> x*x;
        RealValuedFunctionIntegrator integrator = new LowerRectanglesIntegrator();

        double integrate = integrator.integrate(0.0001, function, 0, 10);

        System.out.println("Integral value = " + integrate);
    }
}
