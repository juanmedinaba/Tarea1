/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana1punto1;

import java.util.Scanner;

/**
 *
 * @author Juan Jose
 */
public class Semana1punto1 {

    public static void main(String[] args) {
    int edmama, edalber, edana, edjuan;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese la edad de juan ");
    edjuan = scanner.nextInt();
    edalber = 2*(edjuan/3);
    edana = 4 * (edjuan/3);
    edmama = edjuan+edalber+edana;
    System.out.println("Juan = " + edjuan);
    System.out.println("Alberto = " + edalber);
    System.out.println("Ana = " + edana);
    System.out.println("Mama = " + edmama);
    scanner.close();
   
    
    
    }
  
    
}
       
    

