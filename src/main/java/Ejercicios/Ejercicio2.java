package Ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Ejercicio2 {

    void f(int num, int div)
    {
        if (num>1) {
            if ((num%div) == 0) {
                System.out.println(div);
                f(num/div,div);
            } else {
                f(num,div+1);
            }
        }
    }

    public static List<Integer> factorizarLambda(int num) {

        List<Integer> factores = new ArrayList<>();
        IntStream.rangeClosed(2, num)
                .filter(i -> num % i == 0)
                .forEach(i -> {
                    factores.add(i);
                    factorizarLambda(num / i);
                });
        return factores;
    }

    public static void main(String[] args) {
        Ejercicio2 e = new Ejercicio2();
        e.f(100,2);
        System.out.println("--------------------");
        int num = 100;
        List<Integer> factores = factorizarLambda(num);
        for (int i: factores) {
            System.out.println(i);
        }
    }
}
