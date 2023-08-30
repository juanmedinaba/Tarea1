/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana1punto5;

import java.util.Scanner;

/**
 *
 * @author Juan Jose
 */
public class Semana1punto5 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el radio del circulo: ");
    double radio = scanner.nextDouble();
    double area = Math.PI*(radio*radio);
    double longitud = 2*Math.PI*radio;
    System.out.println("El area es: " + area);
    System.out.println("la longitud es: "+longitud);
    scanner.close(); 
    
    
    }
    
}
