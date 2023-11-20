package ud5.appCalculadora;

/**
 * Calculadora
 */
public class Calculadora {

    private double resultado;

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


    //GETTERS & SETTERS
    public double getResultado() {
        return resultado;
    }
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }






}
