package ejercicios;

public class Ejercicio12 {

    public static void main(String[] args) {
        // 1. Declarar e inicializar el array de precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // 2. Mostrar los precios originales
        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }

        // 3. Modificar el precio de un producto específico
        // Por ejemplo, modificamos el tercer producto (índice 2)
        precios[2] = 129.99;

        // 4. Mostrar los precios modificados
        System.out.println("Precios modificados:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
}
