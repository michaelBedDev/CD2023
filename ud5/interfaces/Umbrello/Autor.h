
#ifndef AUTOR_H
#define AUTOR_H

#include <string>


/**
  * class Autor
  * 
  */

class Autor
{
public:
  // Constructors/Destructors
  //  


  /**
   * Empty Constructor
   */
  Autor();

  /**
   * Empty Destructor
   */
  virtual ~Autor();

  // Static Public attributes
  //  

  // Public attributes
  //  

  std::string nombre;
  std::string nacionalidad;
  std::string fechaNacimiento;

  // Public attribute accessor methods
  //  


  // Public attribute accessor methods
  //  


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
   * Set the value of nacionalidad
   * @param new_var the new value of nacionalidad
   */
  void setNacionalidad(std::string new_var)
  {
    nacionalidad = new_var;
  }

  /**
   * Get the value of nacionalidad
   * @return the value of nacionalidad
   */
  std::string getNacionalidad()
  {
    return nacionalidad;
  }

  /**
   * Set the value of fechaNacimiento
   * @param new_var the new value of fechaNacimiento
   */
  void setFechaNacimiento(std::string new_var)
  {
    fechaNacimiento = new_var;
  }

  /**
   * Get the value of fechaNacimiento
   * @return the value of fechaNacimiento
   */
  std::string getFechaNacimiento()
  {
    return fechaNacimiento;
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

  Libro nuevo_atributo;

  // Private attribute accessor methods
  //  


  // Private attribute accessor methods
  //  


  /**
   * Set the value of nuevo_atributo
   * @param new_var the new value of nuevo_atributo
   */
  void setNuevo_atributo(Libro new_var)
  {
    nuevo_atributo = new_var;
  }

  /**
   * Get the value of nuevo_atributo
   * @return the value of nuevo_atributo
   */
  Libro getNuevo_atributo()
  {
    return nuevo_atributo;
  }

  void initAttributes();

};

#endif // AUTOR_H
