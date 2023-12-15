
#ifndef MULTA_H
#define MULTA_H

#include <string>


/**
  * class Multa
  * 
  */

class Multa
{
public:
  // Constructors/Destructors
  //  


  /**
   * Empty Constructor
   */
  Multa();

  /**
   * Empty Destructor
   */
  virtual ~Multa();

  // Static Public attributes
  //  

  // Public attributes
  //  


  // Public attribute accessor methods
  //  


  // Public attribute accessor methods
  //

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
  std::string fechaFin;

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
   * Set the value of fechaFin
   * @param new_var the new value of fechaFin
   */
  void setFechaFin(std::string new_var)
  {
    fechaFin = new_var;
  }

  /**
   * Get the value of fechaFin
   * @return the value of fechaFin
   */
  std::string getFechaFin()
  {
    return fechaFin;
  }

  void initAttributes();

};

#endif // MULTA_H
