package ejercicios;

public class Ejercicio13 {

    public static void main(String[] args) {
        // 1. Declarar e inicializar el array de precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // 2. Mostrar los precios originales usando recursión
        System.out.println("Precios originales:");
        mostrarPreciosRecursivo(precios, 0);

        // 3. Modificar el precio de un producto específico (índice 2)
        precios[2] = 129.99;

        // 4. Mostrar los precios modificados usando recursión
        System.out.println("Precios modificados:");
        mostrarPreciosRecursivo(precios, 0);
    }

    // Función recursiva para mostrar precios
    public static void mostrarPreciosRecursivo(double[] precios, int indice) {
        if (indice >= precios.length) {
            return; // Caso base: terminó de recorrer el array
        }
        System.out.println("Precio: $" + precios[indice]);
        mostrarPreciosRecursivo(precios, indice + 1); // Llamada recursiva con el siguiente índice
    }
}
