package cd2023.ud5.appCalculadora;

public class CalculadoraTest {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora(45);

        calc.sumar(5);
        calc.imprimir();

        calc.restar(45);
        calc.imprimir();

        calc.multiplicar(2);
        calc.imprimir();

        calc.dividir(10);
        calc.imprimir();

        calc.reset();
        calc.imprimir();

    }
}
