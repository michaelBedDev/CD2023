package CD2023.ud5;

/**
 * Calculadora
 */
public class Calculadora {

    double resultado;

    public void sumar(double x) {
        this.resultado += x;
    }
    public void restar(double x) {
        this.resultado -= x;
    }
    public void multiplicar(double x) {
        this.resultado = this.resultado*x;
    }
    public void dividir(double x) {
        this.resultado = this.resultado/x;
    }
    public void reset() {
        this.resultado = 0;
    }
    public void imprimir() {
        System.out.println("Valor actual calculadora: " + this.resultado);
    }

    //CONSTRUCTORES
    public Calculadora() {}
    
    public Calculadora(double a) {
        this.resultado = a;
    }
}