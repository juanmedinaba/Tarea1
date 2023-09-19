
package ejercicio10;


public class Valormatricula {
    double patrimon, estrato, valor = 50000;
    
    public Valormatricula(double patrimon, double estrato){
        this.patrimon = patrimon;
        this.estrato = estrato;
    }
    
    public void calMatricula(){
        if (patrimon > 2000000 && estrato > 3){
            valor = valor + patrimon * 0.03;       
        }
    }
    
}
