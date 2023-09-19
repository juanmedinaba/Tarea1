
package ejercicio23;


public class Operacion {
    double a, b, c;
    String respuesta;
    
    public Operacion (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void calcular(){
        double operacion = b * b - 4 * a * c;
        
        if (operacion > 0) {
            double x1 = (-b + Math.sqrt(operacion)) / (2 * a);
            double x2 = (-b - Math.sqrt(operacion)) / (2 * a);
            respuesta = "Las soluciones son \n x1 = "  + x1 + "   y   x2 = " + x2;
        } else if (operacion == 0) {
            double x = -b / (2 * a);
            respuesta = "La solución es x = " + x;
        } else {
            respuesta = "No hay soluciones reales.";
        }
    }
}
