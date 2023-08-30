/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana1punto2;
import java.util.Scanner;


/**
 *
 * @author Juan Jose
 */
public class Semana1punto2 {

    public static void main(String[] args) {
    double SUMA, X, Y;    
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa la X: ");
    X = scanner.nextDouble();
    System.out.print("Ingresa la Y: ");
    Y = scanner.nextDouble();
    SUMA = 0;
    SUMA = SUMA + X;
    X = X+Math.pow(Y, 2);//y elevado a la 2
    SUMA = SUMA +(X/Y);
    System.out.println("EL VALOR DE LA SUMA ES: " + SUMA);
    }
}
