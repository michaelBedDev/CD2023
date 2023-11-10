

/**
 * Class Socio
 */
public class Socio {

  //
  // Fields
  //

  private Fecha fechaAlta;
  private String codigo;
  private Persona PersonaSocio;

  //
  // Constructors
  //
  public Socio () { };

  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of fechaAlta
   * @param newVar the new value of fechaAlta
   */
  public void setFechaAlta (Fecha newVar) {
    fechaAlta = newVar;
  }

  /**
   * Get the value of fechaAlta
   * @return the value of fechaAlta
   */
  public Fecha getFechaAlta () {
    return fechaAlta;
  }

  /**
   * Set the value of codigo
   * @param newVar the new value of codigo
   */
  public void setCodigo (String newVar) {
    codigo = newVar;
  }

  /**
   * Get the value of codigo
   * @return the value of codigo
   */
  public String getCodigo () {
    return codigo;
  }

  /**
   * Set the value of PersonaSocio
   * @param newVar the new value of PersonaSocio
   */
  public void setPersonaSocio (Persona newVar) {
    PersonaSocio = newVar;
  }

  /**
   * Get the value of PersonaSocio
   * @return the value of PersonaSocio
   */
  public Persona getPersonaSocio () {
    return PersonaSocio;
  }

  //
  // Other methods
  //

}
