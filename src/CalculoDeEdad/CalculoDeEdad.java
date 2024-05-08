package CalculoDeEdad;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class CalculoDeEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Con esta instrucción soliciamos que el nombre sea ingresado.
        System.out.println("Por favor ingresa un nombre:");
        String nombre = scanner.nextLine();

        // Con esta instrucción solicitamos que el apellido sea ingresado.
        System.out.println("Por favor ingresa un apellido:");
        String apellido = scanner.nextLine();

        //  Con esta instrucción solicitamos el ingreso del año de nacimiento.
        System.out.println("Por favor ingresa el año de nacimiento:");
        int añoNacimiento = scanner.nextInt();

        // Usamos este método para obtener el año actual.
        int añoActual = LocalDate.now().getYear();

        // Usamos este método para calcular la edad.
        int edad = añoActual - añoNacimiento;

        // Con esta instrucción mostramos  el saludo con la edad calculada.
        System.out.println("Hola, feliz día " + nombre + " " + apellido + ", usted tiene " + edad + " años de edad.");

        scanner.close();
    }
}
