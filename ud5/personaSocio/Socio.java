package cd2023.ud5.personaSocio;

public class Socio {
    private String codigo;
    private Fecha fechaAlta;
    private Persona personaSocio;


    //GETTERS & SETTERS
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public Fecha getFechaAlta() {
        return fechaAlta;
    }
    public void setFechaAlta(Fecha fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    public Persona getPersonaSocio() {
        return personaSocio;
    }
    public void setPersonaSocio(Persona personaSocio) {
        this.personaSocio = personaSocio;
    }
}
