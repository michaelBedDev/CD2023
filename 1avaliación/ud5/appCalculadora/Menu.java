package ud5.appCalculadora;

import java.util.Scanner;

public class Menu {
    private int seleccion = -1;
    private Scanner sc = new Scanner(System.in);

    private void imprimir() {

        System.out.println("¿Qué opción deseas escoger?");
        System.out.println("0-Reset");
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");
        System.out.println("5-Resultado anterior");
        int valorTeclado= sc.nextInt();

        if (valorTeclado >-1 && valorTeclado <=5) {
            setSeleccion(valorTeclado);
        }
        else{
            setSeleccion(-1);
        }
    }

    public int getSeleccionValida() {
        this.seleccion = -1;
        while (seleccion == -1) {
        imprimir();
        }
        return seleccion;
    }

    public double getNumeroValido() {
        System.out.println("¿Qué número deseas introducir?");

        do {
            sc.nextLine();
            System.out.println("Número: ");
        } while (!sc.hasNextDouble());

        return sc.nextDouble();
    }

    //GETTERS & SETTERS
    public int getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(int seleccion) {
        this.seleccion = seleccion;
    }

}
