package ud5.appCalculadora;

public class App {

    private Menu menu;
    private Calculadora calculadora;
    private CalculadoraAvanzada calculadoraAvanzada;

    public App() {
        menu = new Menu();
        calculadora = new Calculadora();
        calculadoraAvanzada = new CalculadoraAvanzada();
    }

    public void start() {

        double numero;

        while (true){
            int seleccion = menu.getSeleccionValida();

            switch (seleccion) {
                case 0:
                    calculadora.reset();
                    break;

                case 1:
                    numero = menu.getNumeroValido();
                    calculadora.sumar(numero);
                    break;

                case 2:
                    numero = menu.getNumeroValido();
                    calculadora.restar(numero);
                    break;

                case 3:
                    numero = menu.getNumeroValido();
                    calculadora.multiplicar(numero);
                    break;

                case 4:
                    numero = menu.getNumeroValido();
                    calculadora.dividir(numero);
                    break;

                case 5:
                    numero = menu.getNumeroValido();
                    calculadoraAvanzada.cuadrado();
                    break;

                case 6:
                    numero = menu.getNumeroValido();
                    calculadoraAvanzada.raíz();
                    break;

                case 7:
                    calculadoraAvanzada.deshacer();
                    break;

                default:
                    break;
            }
        calculadora.imprimir();
        }
    }
}
