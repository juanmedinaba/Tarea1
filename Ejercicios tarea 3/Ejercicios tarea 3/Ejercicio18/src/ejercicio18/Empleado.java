package ejercicio18;

public class Empleado {
    int codigo;
    String nombre;
    double horasT;
    double valorH;
    double retencion;
    double salarioB;
    double salarioN;
    
    public void salarioBruto (){
        salarioB = horasT * valorH;
    } 
    
    public void salarioNeto (){
        salarioN = salarioB * (1 - retencion / 100);
    }
    
}