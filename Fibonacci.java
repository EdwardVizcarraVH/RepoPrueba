public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Cantidad de números a generar
        long a = 0, b = 1;

        System.out.println("Serie de Fibonacci (Iterativa) hasta " + n + ":");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            
            // Lógica de intercambio
            long suma = a + b;
            a = b;
            b = suma;
        }
    }
}