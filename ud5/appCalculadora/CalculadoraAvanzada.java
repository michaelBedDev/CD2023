package cd2023.ud5.appCalculadora;

import java.lang.Math;

public class CalculadoraAvanzada extends Calculadora {
    public void raíz() {
        this.resultado = Math.sqrt(this.resultado);
    }

    public void cuadrado() {
        this.resultado = Math.pow(this.resultado, 2);

    }
}
