package ud5.appCalculadora;

import java.lang.Math;

public class CalculadoraAvanzada extends Calculadora {

    private double resultadoAnterior;

    public void raíz() {
        resultadoAnterior = getResultado();
        setResultado(Math.sqrt(getResultado()));
    }

    public void cuadrado() {
        resultadoAnterior = getResultado();
        setResultado(Math.pow(getResultado(), 2));

    }

    public void deshacer() {
        resultadoAnterior = getResultado();
        setResultado(this.resultadoAnterior);
    }

    @Override
    public void sumar(double x) {
        resultadoAnterior = getResultado();
        super.sumar(x);
    }
    @Override
    public void restar(double x) {
        resultadoAnterior = getResultado();
        super.restar(x);
    }
    @Override
    public void multiplicar(double x) {
        resultadoAnterior = getResultado();
        super.multiplicar(x);
    }
    @Override
    public void dividir(double x) {
        resultadoAnterior = getResultado();
        super.dividir(x);
    }
    @Override
    public void reset() {
        resultadoAnterior = 0;
        super.reset();
    }
}
