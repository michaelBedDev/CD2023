
#ifndef LECTOR_H
#define LECTOR_H

#include <string>


/**
  * class Lector
  * 
  */

class Lector
{
public:
  // Constructors/Destructors
  //  


  /**
   * Empty Constructor
   */
  Lector();

  /**
   * Empty Destructor
   */
  virtual ~Lector();

  // Static Public attributes
  //  

  // Public attributes
  //  


  // Public attribute accessor methods
  //  


  // Public attribute accessor methods
  //  



  /**
   */
  void comprobarMultasPendientes()
  {
  }

protected:
  // Static Protected attributes
  //  

  // Protected attributes
  //  


  // Protected attribute accessor methods
  //  


  // Protected attribute accessor methods
  //

private:
  // Static Private attributes
  //  

  // Private attributes
  //  

  int numSocio;
  std::string nombre;
  std::string apellidos;
  std::string direccion;
  Multa nuevo_atributo;

  // Private attribute accessor methods
  //  


  // Private attribute accessor methods
  //  


  /**
   * Set the value of numSocio
   * @param new_var the new value of numSocio
   */
  void setNumSocio(int new_var)
  {
    numSocio = new_var;
  }

  /**
   * Get the value of numSocio
   * @return the value of numSocio
   */
  int getNumSocio()
  {
    return numSocio;
  }

  /**
   * Set the value of nombre
   * @param new_var the new value of nombre
   */
  void setNombre(std::string new_var)
  {
    nombre = new_var;
  }

  /**
   * Get the value of nombre
   * @return the value of nombre
   */
  std::string getNombre()
  {
    return nombre;
  }

  /**
   * Set the value of apellidos
   * @param new_var the new value of apellidos
   */
  void setApellidos(std::string new_var)
  {
    apellidos = new_var;
  }

  /**
   * Get the value of apellidos
   * @return the value of apellidos
   */
  std::string getApellidos()
  {
    return apellidos;
  }

  /**
   * Set the value of direccion
   * @param new_var the new value of direccion
   */
  void setDireccion(std::string new_var)
  {
    direccion = new_var;
  }

  /**
   * Get the value of direccion
   * @return the value of direccion
   */
  std::string getDireccion()
  {
    return direccion;
  }

  /**
   * Set the value of nuevo_atributo
   * @param new_var the new value of nuevo_atributo
   */
  void setNuevo_atributo(Multa new_var)
  {
    nuevo_atributo = new_var;
  }

  /**
   * Get the value of nuevo_atributo
   * @return the value of nuevo_atributo
   */
  Multa getNuevo_atributo()
  {
    return nuevo_atributo;
  }

  void initAttributes();

};

#endif // LECTOR_H
