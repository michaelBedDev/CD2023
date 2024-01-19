
#ifndef COPIA_H
#define COPIA_H

#include <string>


/**
  * class Copia
  * 
  */

class Copia
{
public:
  // Constructors/Destructors
  //  


  /**
   * Empty Constructor
   */
  Copia();

  /**
   * Empty Destructor
   */
  virtual ~Copia();

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
  void devolver()
  {
  }


  /**
   */
  void prestar()
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

  int identificador;
  boolean estado;
  Libro nuevo_atributo;

  // Private attribute accessor methods
  //  


  // Private attribute accessor methods
  //  


  /**
   * Set the value of identificador
   * @param new_var the new value of identificador
   */
  void setIdentificador(int new_var)
  {
    identificador = new_var;
  }

  /**
   * Get the value of identificador
   * @return the value of identificador
   */
  int getIdentificador()
  {
    return identificador;
  }

  /**
   * Set the value of estado
   * @param new_var the new value of estado
   */
  void setEstado(boolean new_var)
  {
    estado = new_var;
  }

  /**
   * Get the value of estado
   * @return the value of estado
   */
  boolean getEstado()
  {
    return estado;
  }

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

#endif // COPIA_H
