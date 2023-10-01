/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.practica2_cajero;
import java.util.Scanner;

/**
 *
 * @author expec
 */
public class Practica2_Cajero {
    public static void main(String[] args) {
        double dinero = 1000.0;
        Scanner e = new Scanner(System.in);
        System.out.println("Bienvenido al cajero automático.");
        System.out.println("Por favor, seleccione una opción:");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Depositar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Salir");
        int op = e.nextInt();
        switch (op) {
            case 1:
                System.out.println("Su saldo es: " + dinero);
                break;
            case 2:
                System.out.println("¿Cuánto dinero va depositar?");
                double deposito = e.nextDouble();
                dinero += deposito;
                System.out.println("Su nuevo saldo es: " + dinero);
                break;
            case 3:
                System.out.println("¿Cuánto dinero va retirar?");
                double retiro = e.nextDouble();
                if (retiro <= dinero) {
                    dinero -= retiro;
                    System.out.println("Retiro exitoso. Su nuevo saldo es: " + dinero);
                } else {
                    System.out.println("Fondos insuficientes.");
                }
                break;
            case 4:
                System.out.println("Gracias por usar el cajero automático.");
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                break;
        }
        e.close();
    }
}