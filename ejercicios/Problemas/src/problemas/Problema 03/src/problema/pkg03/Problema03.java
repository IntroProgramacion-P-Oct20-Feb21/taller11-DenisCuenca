/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double n1;
        double n2;
        double n3;
        double n4;
        System.out.println("Ingrese el primer parámetro: ");
        n1 = in.nextDouble();
        System.out.println("Ingrese el segundo parámetro: ");
        n2 = in.nextDouble();
        System.out.println("Ingrese el tercero parámetro: ");
        n3 = in.nextDouble();
        System.out.println("Ingrese el cuarto parámetro: ");
        n4 = in.nextDouble();
        promedio(n1, n2, n3, n4);
    }

    public static void promedio(double l1, double l2, double l3, double l4) {
        double pro = l1 + l2 + l3 + l4;
        String cualitativo;
        if (pro <= 5) {
            cualitativo = "Regular";
        } else {
            if (pro >= 5.1 && pro <= 8) {
                cualitativo = "Bueno";

            } else {
                if (pro >= 8.1 && pro <= 9) {
                    cualitativo = "Muy bueno";
                } else {
                    cualitativo = "Sobresaliente";
                }
            }
        }
        System.out.printf("El promedio de las notas: %.2f, %.2f, %.2f, %.2f es %s \n",
                l1, l2, l3, l4, cualitativo);
    }
}
