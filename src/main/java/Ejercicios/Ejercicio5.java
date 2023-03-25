package Ejercicios;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Ejercicio5 {

    public void EuclidesRecursiva(int m, int n){
        if (m > n){
            int r = m % n;
            if (r == 0) {
                System.out.println(n);
            }else{
                EuclidesIterativo(n, r);
            }
        }else{
            System.out.println("M debe ser mayor que N");
        }
    }

    public void EuclidesIterativo(int m, int n){
        if (m > n){
            int r = n % m;
            while (r != 0){
                m = n;
                n = r;
                r = n % m;
            }
            System.out.println(n);
        }else{
            System.out.println("N debe ser mayor que M");
        }
    }

    BiFunction<Integer, Integer, Integer> euclidesLambda = (m,n) -> {
        if (m > n){
            int r = n % m;
            while (r != 0){
                m = n;
                n = r;
                r = n % m;
            }
            return n;
        }else{
            System.out.println("N debe ser mayor que M");
        }
        return null;
    };

    public static void main(String[] args) {


        Ejercicio5 e = new Ejercicio5();
        e.EuclidesRecursiva(100, 50);
        System.out.println("--------------------");
        e.EuclidesIterativo(100, 50);
        System.out.println("--------------------");
        System.out.println(e.euclidesLambda.apply(100, 50));


    }
}
