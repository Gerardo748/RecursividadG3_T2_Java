/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividadg3;

/**
 *
 * @author rodri
 */

import java.util.Scanner;

public class RecursividadG3 {

  

    public static int factorial(int n) {

        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

   

    public static int vocales(String cadena) {

        if (cadena.length() == 0) {
            return 0;
        }

        char letra = Character.toLowerCase(cadena.charAt(0));

        int contador = 0;

        if (letra == 'a' || letra == 'e' || letra == 'i'
                || letra == 'o' || letra == 'u') {

            contador = 1;
        }

        return contador + vocales(cadena.substring(1));
    }

 

    public static int sumaDigitos(int numero) {

        if (numero == 0) {
            return 0;
        }

        return (numero % 10) + sumaDigitos(numero / 10);
    }

   

    public static int suma(int n) {

        if (n == 0) {
            return 0;
        }

        return suma(n - 1) + n;
    }


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        System.out.println("=================================");
        System.out.println("       EJERCICIO 1: FACTORIAL");
        System.out.println("=================================");

        System.out.print("Ingresa un numero: ");
        int numeroFactorial = entrada.nextInt();

        System.out.println("Resultado: " + factorial(numeroFactorial));

        // --------------------------------------
        // EJERCICIO 2: CONTAR VOCALES
        // --------------------------------------

        System.out.println("\n=================================");
        System.out.println("       EJERCICIO 2: VOCALES");
        System.out.println("=================================");

        entrada.nextLine();

        System.out.print("Ingresa una cadena: ");
        String texto = entrada.nextLine();

        System.out.println("Cadena: " + texto);
        System.out.println("Numero de vocales: " + vocales(texto));

        // --------------------------------------
        // EJERCICIO 3: SUMA DE DIGITOS
        // --------------------------------------

        System.out.println("\n=================================");
        System.out.println("       EJERCICIO 3: DIGITOS");
        System.out.println("=================================");

        System.out.print("Cuantos numeros vas a ingresar: ");
        int cantidad = entrada.nextInt();

        int numeroMayor = 0;
        int mayorSuma = -1;

        for (int i = 1; i <= cantidad; i++) {

            System.out.print("Ingresa el numero " + i + ": ");
            int numero = entrada.nextInt();

            int resultado = sumaDigitos(numero);

            System.out.println(
                    "Suma de sus digitos: " + resultado
            );

            if (resultado > mayorSuma) {
                mayorSuma = resultado;
                numeroMayor = numero;
            }
        }

        System.out.println("---------------------------------");
        System.out.println("Numero con mayor suma: " + numeroMayor);
        System.out.println("Mayor suma de digitos: " + mayorSuma);

        // --------------------------------------
        // EJERCICIO 4: SUMA DE LOS PRIMEROS N
        // --------------------------------------

        System.out.println("\n=================================");
        System.out.println("       EJERCICIO 4: SUMA");
        System.out.println("=================================");

        System.out.print("Ingresa el valor de n: ");
        int n = entrada.nextInt();

        System.out.println(
                "Suma de los primeros " + n
                + " numeros: " + suma(n)
        );

        System.out.println("=================================");

        entrada.close();
    }
}

