import java.util.Scanner;

public class Programa_par {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número entero gaaaaaaaa: ");
        int numero = teclado.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es PAR OMG.");
        } else {
            System.out.println("El número " + numero + " es IMPAR OMG.");
        }
        
        teclado.close();
    }
}