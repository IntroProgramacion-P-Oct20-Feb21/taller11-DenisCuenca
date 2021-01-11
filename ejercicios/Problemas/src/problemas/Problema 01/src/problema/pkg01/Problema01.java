/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg01;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        array(informacion);
    }

    public static void array(int[][] n1) {

        for (int fila = 0; fila < n1.length; fila++) {
            for (int col = 0; col < n1[fila].length; col++) {
                if ((n1[fila][col] % 2) == 0) {
                    System.out.println(n1[fila][col]);
                }
            }
        }
    }
}
