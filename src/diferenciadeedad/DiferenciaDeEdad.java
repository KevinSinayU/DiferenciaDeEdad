package diferenciadeedad;
/**
 *
 * @author ksinay
 */
import java.util.Scanner;

public class DiferenciaDeEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los años de nacimiento
        System.out.print("Ingrese el año de nacimiento de la primera persona: ");
        int anioNacimiento1 = scanner.nextInt();

        System.out.print("Ingrese el año de nacimiento de la segunda persona: ");
        int anioNacimiento2 = scanner.nextInt();

        // Calcular la edad de las personas
        int edad1 = 2024 - anioNacimiento1;
        int edad2 = 2024 - anioNacimiento2;

        // Calcular la diferencia de edad
        int diferencia = Math.abs(edad1 - edad2);

        // Determinar quién es mayor
        if (edad1 > edad2) {
            System.out.println("La primera persona es mayor por " + diferencia + " años.");
        } else if (edad2 > edad1) {
            System.out.println("La segunda persona es mayor por " + diferencia + " años.");
        } else {
            System.out.println("Ambas personas tienen la misma edad.");
        }

        scanner.close();
    }
}

