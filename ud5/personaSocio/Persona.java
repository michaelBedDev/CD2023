package cd2023.ud5.personaSocio;

public class Persona {
    private DNI NIF;
    private Nombre nombreCompleto;
    private Fecha fechaNac;


    public Socio altaSocio() {

        return socioNew;
    }


    //GETTERS & SETTERS
    public DNI getNIF() {
        return NIF;
    }

    public void setNIF(DNI nIF) {
        NIF = nIF;
    }

    public Nombre getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(Nombre nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Fecha getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Fecha fechaNac) {
        this.fechaNac = fechaNac;
    }

}
