package cd2023.ud5.appCalculadora;

public class CalculadoraAvanzada extends Calculadora {
    public void raíz() {
        this.resultado = Math.sqrt(resultado);
    }

    public void cuadrado() {
        this.resultado = Math.pow(resultado, 2);

    }
}
