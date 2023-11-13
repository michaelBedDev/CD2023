abstract class Animal {                              //Se crea la clase abstracta para definir un método "común" para cada clase hija
    public abstract void animalSound();

    public void sleep(){
        System.out.println("Zzzz");
    }
        //El método en sí mismo será distinto para cada clase pero será el mismo. Obligatorio definir el método para las clases hijas
}
