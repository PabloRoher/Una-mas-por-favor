package Ejercicios;

public class Ejercicio1 {
    static final double N = 2;
    static final double PREC = 1e-6;
    static double f (double x)
    {
        return x*x-N;
    }
    static double bisect (double min, double max) {
        double med = (min + max) / 2;
        if (max - min < PREC) {
            return med;
        } else if (f(min) * f(med) < 0) {
            return bisect(min, med);
        } else {
            return bisect(med, max);
        }
    }

    public static void main(String[] args) {
        System.out.println(bisect(0, N));
    }
}
