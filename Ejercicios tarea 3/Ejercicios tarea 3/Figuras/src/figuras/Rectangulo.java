
package figuras;


public class Rectangulo {
    double base; 
    double altura; 

    Rectangulo(double base, double altura) {
    this.base = base;
    this.altura = altura;
}

    double calcularArea() {
    return base * altura;
}

    double calcularPerímetro() {
    return (2 * base) + (2 * altura);
}
    
}
