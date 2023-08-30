/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana1punto3;

/**
 *
 * @author Juan Jose
 */
public class Semana1punto3 {

    public static void main(String[] args) {
    double salariobruto, retencion, salarioneto;
    salariobruto= 5000*48;
    retencion=(salariobruto*12.5)/100;
    salarioneto= salariobruto-retencion;
    System.out.println("El salario bruto es: "+(int)salariobruto);
    System.out.println("La retencion es: "+(int)retencion);
    System.out.println("El salario neto es: "+(int)salarioneto);
    
    }
}
