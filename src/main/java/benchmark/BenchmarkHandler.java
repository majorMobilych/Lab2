package benchmark;

import infrastructure.RealValuedFunction;
import infrastructure.RealValuedFunctionIntegrator;
import methods.LowerRectanglesIntegrator;
import methods.SimpsonIntegrator;
import methods.TrapezoidalIntegrator;
import methods.UpperRectanglesIntegrator;

public class BenchmarkHandler {

    //Very bad
    
    private static final RealValuedFunctionIntegrator LOWER_RECTANGLE_INTEGRATOR = new LowerRectanglesIntegrator();
    private static final RealValuedFunctionIntegrator UPPER_RECTANGLE_INTEGRATOR = new UpperRectanglesIntegrator();
    private static final RealValuedFunctionIntegrator TRAPEZOIDAL_INTEGRATOR = new TrapezoidalIntegrator();
    private static final RealValuedFunctionIntegrator SIMPSON_INTEGRATOR = new SimpsonIntegrator();

    private static final RealValuedFunction FUNCTION = Math::cos;

    private static final double INTEGRATE_FROM = 0;
    private static final double INTEGRATE_TO = Math.PI/2;

    private static final double ACCURACY = 0.00001;

    public static void main(String[] args) {

        long startTimeLowerRectangle = System.nanoTime();
        LOWER_RECTANGLE_INTEGRATOR.integrate(ACCURACY, FUNCTION, INTEGRATE_FROM, INTEGRATE_TO);
        long endTimeLowerRectangle = System.nanoTime();
        System.out.println("BENCHMARK FOR LOWER RECTANGLES: " + (endTimeLowerRectangle - startTimeLowerRectangle));

        long startTimeUpperRectangle = System.nanoTime();
        UPPER_RECTANGLE_INTEGRATOR.integrate(ACCURACY, FUNCTION, INTEGRATE_FROM, INTEGRATE_TO);
        long endTimeUpperRectangle = System.nanoTime();
        System.out.println("BENCHMARK FOR UPPER RECTANGLES: " + (endTimeUpperRectangle - startTimeUpperRectangle));

        long startTimeTrapezoidal = System.nanoTime();
        TRAPEZOIDAL_INTEGRATOR.integrate(ACCURACY, FUNCTION, INTEGRATE_FROM, INTEGRATE_TO);
        long endTimeTrapezoidal = System.nanoTime();
        System.out.println("BENCHMARK FOR TRAPEZOIDAL: " + (endTimeTrapezoidal - startTimeTrapezoidal));

        long startTimeSimpson= System.nanoTime();
        SIMPSON_INTEGRATOR.integrate(ACCURACY, FUNCTION, INTEGRATE_FROM, INTEGRATE_TO);
        long endTimeSimpson = System.nanoTime();
        System.out.println("BENCHMARK FOR SIMPSON: " + (endTimeSimpson - startTimeSimpson));
    }
}
