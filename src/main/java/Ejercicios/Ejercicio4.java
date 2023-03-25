package Ejercicios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Ejercicio4 {

    final List<String> n = Arrays.asList("0", "1", "2","3", "4", "5", "6", "7", "8", "9");

    public void palidromo(String palabra1){
        String palabra = palabra1.toLowerCase();
        String palabraInvertida = "";
        try{
            for (int i = palabra.length()-1; i >= 0; i--) {
                for (int j = 0; j < n.size(); j++) {
                    if (palabra.charAt(i) == n.get(j).charAt(0)){
                        throw new IllegalArgumentException("No se puede introducir numeros");
                    }
                }
                palabraInvertida += palabra.charAt(i);
            }
            if (palabra.length() == 0){
                System.out.println("No has escrito ninguna palabra");
            }else if (palabra.equals(palabraInvertida)){
                System.out.println("Es palidromo");
            }else{
                System.out.println("No es palidromo");
            }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public boolean palndromoRecurivo(String palabra1){
        try {
            String palabra = palabra1.toLowerCase();
            for (int i = 0; i < n.size(); i++) {
                if (palabra.charAt(palabra.length() - 1) == n.get(i).charAt(0)){
                    throw new IllegalArgumentException("No se puede introducir numeros");
                }
            }
            if (palabra.length() == 0) {
                System.out.println("No has escrito ninguna palabra");
                return true;
            } else if (palabra.length() == 1) {
                System.out.println("Es palidromo");
                return true;
            } else if (palabra.charAt(0) == palabra.charAt(palabra.length() - 1)) {

                return palndromoRecurivo(palabra.substring(1, palabra.length() - 1));
            } else {
                System.out.println("No es palidromo");
                return false;
            }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return false;
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("No has escrito ninguna palabra");
            return false;
        }

    }


    public static void main(String[] args) {
        Ejercicio4 e = new Ejercicio4();
        e.palidromo("1");
        e.palndromoRecurivo("");
    }
}
