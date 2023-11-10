

/**
 * Class Persona
 */
public class Persona {

  //
  // Fields
  //

  private DNI NIF;
  private Nombre nombreCompleto;
  private Fecha fechaNac;
  
  //
  // Constructors
  //
  public Persona () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of NIF
   * @param newVar the new value of NIF
   */
  public void setNIF (DNI newVar) {
    NIF = newVar;
  }

  /**
   * Get the value of NIF
   * @return the value of NIF
   */
  public DNI getNIF () {
    return NIF;
  }

  /**
   * Set the value of nombreCompleto
   * @param newVar the new value of nombreCompleto
   */
  public void setNombreCompleto (Nombre newVar) {
    nombreCompleto = newVar;
  }

  /**
   * Get the value of nombreCompleto
   * @return the value of nombreCompleto
   */
  public Nombre getNombreCompleto () {
    return nombreCompleto;
  }

  /**
   * Set the value of fechaNac
   * @param newVar the new value of fechaNac
   */
  public void setFechaNac (Fecha newVar) {
    fechaNac = newVar;
  }

  /**
   * Get the value of fechaNac
   * @return the value of fechaNac
   */
  public Fecha getFechaNac () {
    return fechaNac;
  }

  //
  // Other methods
  //

  /**
   * @return       Socio
   */
  public Socio altaSocio()
  {
  }


}
