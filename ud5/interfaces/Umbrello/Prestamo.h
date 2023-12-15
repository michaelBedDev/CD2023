
#ifndef PRESTAMO_H
#define PRESTAMO_H

#include <string>


/**
  * class Prestamo
  * 
  */

class Prestamo
{
public:
  // Constructors/Destructors
  //  


  /**
   * Empty Constructor
   */
  Prestamo();

  /**
   * Empty Destructor
   */
  virtual ~Prestamo();

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
  void calcularFechaFin()
  {
  }


  /**
   */
  void generarMuta()
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

  std::string fechaInicio;
  std::string fechafin;

  // Private attribute accessor methods
  //  


  // Private attribute accessor methods
  //  


  /**
   * Set the value of fechaInicio
   * @param new_var the new value of fechaInicio
   */
  void setFechaInicio(std::string new_var)
  {
    fechaInicio = new_var;
  }

  /**
   * Get the value of fechaInicio
   * @return the value of fechaInicio
   */
  std::string getFechaInicio()
  {
    return fechaInicio;
  }

  /**
   * Set the value of fechafin
   * @param new_var the new value of fechafin
   */
  void setFechafin(std::string new_var)
  {
    fechafin = new_var;
  }

  /**
   * Get the value of fechafin
   * @return the value of fechafin
   */
  std::string getFechafin()
  {
    return fechafin;
  }

  void initAttributes();

};

#endif // PRESTAMO_H
