package com.michaelbeddev;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class EstudianteTest{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    /**
     * Prueba unitaria para el constructor de la clase Estudiante.
     */
    @Test
    public void testEstudiante() {
        Estudiante estudiante = new Estudiante("Michael", 20);
        assertTrue(estudiante.getNombre().equals("Michael"));
        assertTrue(estudiante.getEdad() == 20);
    }

    /**
     * Prueba unitaria para el método esUniversitario de la clase Estudiante.
     */
    @Test
    public void testEsUniversitario() {
        Estudiante estudiante = new Estudiante("Michael", 20);
        assertTrue(estudiante.esUniversitario());
    }

    /**
     * Prueba unitaria para el método aprobo (true) de la clase Estudiante.
     */
    @Test
    public void testAprobo() {
        Estudiante estudiante = new Estudiante("Michael", 20);
        estudiante.setCalificacion(10.0);
        assertTrue(estudiante.aprobo());
    }

    /**
     * Prueba unitaria para el método aprobo (false) de la clase Estudiante.
     */
    @Test
    public void testReprobo() {
        Estudiante estudiante = new Estudiante("Michael", 20);
        estudiante.setCalificacion(4.0);
        assertFalse(estudiante.aprobo());
    }

    /**
     * Prueba unitaria para el método edadEscolar de la clase Estudiante.
     */
    @Test
    public void testEdadEscolar() {
        Estudiante estudiante = new Estudiante("Michael", 60);
        assertEquals(estudiante.edadEscolar(), 5);
    }

    /**
     * Prueba unitaria para el método imprimirInformacion de la clase Estudiante.
     */
    @Test
    public void testImprimirInformacion() {
        Estudiante estudiante = new Estudiante("Michael", 20);
        estudiante.setCalificacion(10.0);
        assertTrue(estudiante.imprimirInformacion().equals("Nombre: Michael\nEdad: 20\nCalificación: 10.0"));
    }
}
