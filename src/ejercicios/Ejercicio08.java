package ejercicios;

import java.util.Scanner;

public class Ejercicio08 {
    // Método que calcula el precio final
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        return precioFinal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = scanner.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuestoPorcentaje = scanner.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuentoPorcentaje = scanner.nextDouble();

        // Convertir porcentajes a decimales
        double impuestoDecimal = impuestoPorcentaje / 100;
        double descuentoDecimal = descuentoPorcentaje / 100;

        // Llamar al método para calcular el precio final
        double precioFinal = calcularPrecioFinal(precioBase, impuestoDecimal, descuentoDecimal);

        System.out.println("El precio final del producto es: " + precioFinal);

        scanner.close();
    }

}
