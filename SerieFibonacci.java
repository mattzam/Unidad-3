/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seriefibonacci;

import java.util.Scanner;

/**
 *
 * @author expec
 */
public class SerieFibonacci {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,uno = 0, dos = 1;
        Scanner e = new Scanner(System.in);
        System.out.println("Escribe la cantidad de numeros que quieres ver: ");
        n = e.nextInt();
        System.out.println("La serie de fibonacci va: ");
        
        for (int i = 0; i < n; i++) {
            System.out.println(i+".- "+uno + " ");
            int suma = uno + dos;
            uno = dos;
            dos = suma;
    }
    }
}
