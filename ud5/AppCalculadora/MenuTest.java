package CD2023.ud5.AppCalculadora;

public class MenuTest {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.getSeleccionValida();
        System.out.println("Opción: " + menu.getSeleccion());
    }
}
