
package CalculoDeEdad;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class CalculoEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Por favor ingresa un nombre:");  // Con esta instrucción soliciamos que el nombre sea ingresado.
        String nombre = scanner.nextLine();
       
        System.out.println("Por favor ingresa un apellido:");  // Con esta instrucción solicitamos que el apellido sea ingresado.
        String apellido = scanner.nextLine();
       
        System.out.println("Por favor ingresa el año de nacimiento:");  // Con esta instrucción solicitamos el ingreso del año de nacimiento.
        int añoNacimiento = scanner.nextInt();
        
        int añoActual = LocalDate.now().getYear(); // Usamos este método para obtener el año actual.
        
        int edad = añoActual - añoNacimiento; // Usamos este método para calcular la edad.
        
        System.out.println("Hola, feliz día " + nombre + " " + apellido + ", usted tiene " + edad + " años de edad."); // Con esta instrucción mostramos el saludo con la edad calculada.

        scanner.close();
    }
}
