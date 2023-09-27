/*;
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica1_if;

import java.util.Scanner;

/**
 *
 * @author expec
 */
public class Practica1_if {

    public static void main(String[] args) {
        int n;
        System.out.println("Ingresa un número para evaluar si es par o impar");
        Scanner e = new Scanner(System.in);
        n = e.nextInt();
        if(n%2==0){
            System.out.println("Tu número es par");
        }else{
            System.out.println("Tu número es impar");
        }
            
    }
}
