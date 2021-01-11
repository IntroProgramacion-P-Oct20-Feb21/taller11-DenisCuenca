/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        int de = 0;

        System.out.println("Indique el proceso que desea realizar:\n"
                + "(1) para calcular el área de un cuadrado.\n"
                + "(2) calcular el área de triángulo.\n(3) calcular el área de un rectángulo.  ");
        de = in.nextInt();

        switch (de) {
            case 1:
                obtenerAreaCuadrado(in);
                break;
            case 2:
                obtenerAreaTriangulo(in);
                break;
            case 3:
                obtenerAreaRectangulo(in);
                break;
            default:
                System.out.println("Valor fuera de rango");
                break;

        }
    }

    public static void obtenerAreaCuadrado(Scanner in) {
        double lado;
        System.out.println("Ingrese el valor del lado del cuadrado: ");
        lado = in.nextDouble();
        lado *= lado;
        System.out.printf("El resultado es: %.2f\n", lado);
    }

    public static void obtenerAreaTriangulo(Scanner in) {
        double altura;
        double base;
        double area;
        System.out.println("Ingrese la altura del triángulo: ");
        altura = in.nextDouble();
        System.out.println("Ingrese la base del triángulo: ");
        base = in.nextDouble();
        area = (altura * base) / 2;
        System.out.printf("El resultado es: %.2f\n", area);
    }

    public static void obtenerAreaRectangulo(Scanner in) {
        double altura;
        double base;
        double area;
        System.out.println("Ingrese la altura del rectángulo: ");
        altura = in.nextDouble();
        System.out.println("Ingrese la base del rectángulo: ");
        base = in.nextDouble();
        area = altura * base;
        System.out.printf("El resultado es: %.2f\n", area);
    }
}
