package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

    // Variable global
    public static final double DESCUENTO_ESPECIAL = 0.10;

    // Método que calcula el descuento
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el precio al usuario
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        // Calcular y mostrar el descuento
        calcularDescuentoEspecial(precio);

        scanner.close();
    }
}
