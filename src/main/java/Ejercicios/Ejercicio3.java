package Ejercicios;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Ejercicio3 {
    List<String> digitos = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B","C", "D", "E", "F");
    List<Integer> resto = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

    public String correspondecia(int num){
        for (int i = 0; i < resto.size(); i++) {
            if (num == resto.get(i)){
                return digitos.get(i);
            }
        }
        return null;
    }

    Function<Integer,String> hexadecimal = (num) -> {
        String hex = "";
        while (num > 0) {
            int x = num % 16;
            hex = correspondecia(x) + hex;
            num = num / 16;
        }
        return hex;
    };

    public static void main(String[] args) {
        Ejercicio3 e = new Ejercicio3();
        System.out.println(e.hexadecimal.apply(65029));
    }

}
