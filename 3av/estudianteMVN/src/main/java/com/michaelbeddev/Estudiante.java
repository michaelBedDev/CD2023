package com.michaelbeddev;
/**
 * Clase que representa a un estudiante.
 */
public class Estudiante {
/**
 * Atributos de la clase Estudiante.
 */
    private String nombre;
    private int edad;
    private double calificacion;

/**
 * Constructor de la clase Estudiante.
 * @param nombre Nombre del estudiante.
 * @param edad Edad del estudiante.
 */
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = 0.0;
    }

/**
 * Setter que modifica la calificación del estudiante.
 * @param calificacion Calificación del estudiante.
 */
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

/**
 * Getter que retorna el nombre del estudiante.
 * @return Nombre del estudiante.
 */
    public String getNombre() {
        return nombre;
    }

/**
 * Setter que modifica el nombre del estudiante.
 * @param nombre Nombre del estudiante.
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

/**
 * Getter que retorna la edad del estudiante.
 * @return Edad del estudiante.
 */
    public int getEdad() {
        return edad;
    }

/**
 * Setter que modifica la edad del estudiante.
 * @param edad Edad del estudiante.
 */
    public void setEdad(int edad) {
        this.edad = edad;
    }

/**
 * Getter que retorna la calificación del estudiante.
 * @return Calificación del estudiante.
 */
    public double getCalificacion() {
        return calificacion;
    }


/**
 * Método que determina si el estudiante aprobó.
 * @return true si la calificación es mayor o igual a 5.0, false en caso contrario.
 */
    public boolean aprobo() {
        return calificacion >= 5.0;
    }

/**
 * Método que determina si el estudiante está en edad escolar
 * @return La edad del estudiante en años escolares.
 */
    public int edadEscolar() {
        return edad / 12;
    }

/**
 * Método que determina si el estudiante es universitario. +18 años.
 * @return true si es mayor o igual a 18 años, false en caso contrario.
 */
    public boolean esUniversitario() {
        return edad >= 18;
    }

/**
 * Método que imprime la información del estudiante.
 */
    public String imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Calificación: " + calificacion);

        return "Nombre: " + nombre + "\nEdad: " + edad + "\nCalificación: " + calificacion;
    }
}
