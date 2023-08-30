/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana1punto4;

import java.util.Scanner;

/**
 *
 * @author Juan Jose
 */
public class Semana1punto4 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa el número: ");
    double numero = scanner.nextDouble();
    double cuadrado= numero*numero;
    double cubo= numero*numero*numero;
    System.out.println("El cuadrado es: "+(int)cuadrado);
    
    System.out.println("El cubo es: "+(int)cubo);
    scanner.close();
    
   
    }
    
}