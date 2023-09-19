
package ejercicio7;


public class Cal {
    double a, b; 
    String res;
    
    public Cal(double a, double b){
        this.a = a;
        this.b = b;
    }
    
    public void calcular(){
        if (a > b) {
          res = "A es mayor que B";
        } 
        else if (a == b) {
            res = "A es igual a B";
        }
        else{
            res = "A es menor que B";
        }
    }
    
}
