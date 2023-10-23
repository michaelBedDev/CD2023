package CD2023.ud5;

import java.util.Scanner;

public class Menu {
    private int seleccion = -1;


    private void imprimir() {

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué opción deseas escoger? 0/1/2/3/4");
        int valorTeclado= sc.nextInt();

        if (valorTeclado >-1 && valorTeclado <5) {
            setSeleccion(valorTeclado);
        }
        else{
            setSeleccion(-1);
        }

        sc.close();
    }

    public int getSeleccionValida() {
        while (seleccion == -1) {
        imprimir();
        }
        return seleccion;
    }


    //GETTERS & SETTERS
    public int getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(int seleccion) {
        this.seleccion = seleccion;
    }
    
}
