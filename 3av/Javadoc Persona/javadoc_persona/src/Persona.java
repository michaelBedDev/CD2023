/**
 * Class whose instances represent people.
 *
 */
public class Persona {

    /**
     * Name of the person.
     */
    private String nombre;

    /**
     * Age of the person.
     */
    private int edad;

    /**
     * Creates a new instance of the class.
     * (Constructor with parameters)
     *
     * @param nombre Name of the person.
     * @param edad Age of the person.
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Getter method for the name attribute.
     * @return The name of the person.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter method for the name attribute.
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter method for the age attribute.
     * @return The age of the person.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Setter method for the age attribute.
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Prints the details of the person.
     * (Name and age)
     */
    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
