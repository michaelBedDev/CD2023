
#ifndef LIBRO_H
#define LIBRO_H

#include <string>


/**
  * class Libro
  * 
  */

class Libro
{
public:
  // Constructors/Destructors
  //  


  /**
   * Empty Constructor
   */
  Libro();

  /**
   * Empty Destructor
   */
  virtual ~Libro();

  // Static Public attributes
  //  

  // Public attributes
  //  

  std::string nombre;
  std::string tipo;
  std::string editorial;
  std::string año;

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
   * Set the value of tipo
   * @param new_var the new value of tipo
   */
  void setTipo(std::string new_var)
  {
    tipo = new_var;
  }

  /**
   * Get the value of tipo
   * @return the value of tipo
   */
  std::string getTipo()
  {
    return tipo;
  }

  /**
   * Set the value of editorial
   * @param new_var the new value of editorial
   */
  void setEditorial(std::string new_var)
  {
    editorial = new_var;
  }

  /**
   * Get the value of editorial
   * @return the value of editorial
   */
  std::string getEditorial()
  {
    return editorial;
  }

  /**
   * Set the value of año
   * @param new_var the new value of año
   */
  void setAño(std::string new_var)
  {
    año = new_var;
  }

  /**
   * Get the value of año
   * @return the value of año
   */
  std::string getAño()
  {
    return año;
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

  Autor nuevo_atributo;

  // Private attribute accessor methods
  //  


  // Private attribute accessor methods
  //  


  /**
   * Set the value of nuevo_atributo
   * @param new_var the new value of nuevo_atributo
   */
  void setNuevo_atributo(Autor new_var)
  {
    nuevo_atributo = new_var;
  }

  /**
   * Get the value of nuevo_atributo
   * @return the value of nuevo_atributo
   */
  Autor getNuevo_atributo()
  {
    return nuevo_atributo;
  }

  void initAttributes();

};

#endif // LIBRO_H
