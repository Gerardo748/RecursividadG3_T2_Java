/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividadg3;

/**
 *
 * @author rodri
 */

public class RecursividadG3 {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int numero = 5;

        System.out.println("Factorial de " + numero + ": " + factorial(numero));
    }
}