//Ejercicio 1: Verificación de Año Bisiesto
package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        // Crear objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar el año al usuario
        System.out.print("Ingrese un año: ");
        int anio = scanner.nextInt();

        // Verificar si el año es bisiesto
        boolean esBisiesto = false;

        // Un año es bisiesto si:
        // 1. Es divisible por 4 Y no es divisible por 100, O
        // 2. Es divisible por 400
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            esBisiesto = true;
        }

        // Mostrar el resultado
        if (esBisiesto) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
