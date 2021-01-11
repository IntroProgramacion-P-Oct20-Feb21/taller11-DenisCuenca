package promedio.pkg04;

import java.util.Locale;
import java.util.Scanner;

public class Promedio04 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        int de;
        String nombre;
        String id;
        System.out.println("Ingrese su nombre: ");
        nombre = in.nextLine();
        System.out.println("Ingrese su número de cédula: ");
        id = in.nextLine();

        System.out.println("Ingrese el proceso a realizar:\n"
                + "(1) para calcular el valor de la planilla de luz. \n"
                + "(2) para calcular el valor del predio de un bien inmueble.");
        de = in.nextInt();
        switch (de) {
            case 1:
                luz(nombre, id, in);
                break;
            case 2:
                im(nombre, id, in);
                break;
            default:
                System.out.println("Valor fuera de rango");
        }

    }

    public static void luz(String n, String id, Scanner in) {
        double vK;
        double nK;
        double total;
        System.out.println("Ingrese el valor de kilowatio: ");
        vK = in.nextDouble();
        System.out.println("Ingrese su número de kilowatios consmidos por mes;");
        nK = in.nextDouble();
        total = vK * nK;
        System.out.printf("Cliente %s con cédula %s debe cancelar el valor de $%.2f.\n",
                n, id, total);
    }

    public static void im(String n, String id, Scanner in) {
        double vInmueble;
        double vPredio;
        System.out.println("Ingrese el valor del inmueble: ");
        vInmueble = in.nextDouble();
        vPredio = vInmueble * 0.02;
        System.out.printf("Cliente %s con cédula %s tiene un bien inmueble "
                + "valorado en $%.2f y tiene que pagar de predio $%.2f.\n", n, id, vInmueble, vPredio);
    }
}
