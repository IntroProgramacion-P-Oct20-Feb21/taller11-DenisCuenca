/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        int limite = 5;
        int contador = 1;
        int numerador;
        double denominador;

        while (contador <= limite) {
            numerador = contador;

            denominador = obtenerDenominador(numerador);
            numerador = obtenerNumerador(contador);
            System.out.printf("%d/%.1f\t", numerador, denominador);
            contador = contador + 1;
        }
    }

    public static double obtenerDenominador(int numero) {

        double valor = Math.pow(numero, 3);

        return valor;
    }

    public static int obtenerNumerador(int num) {
        int n1;
        n1 = (int)Math.pow(num, 2);
        return n1;

    }
}
