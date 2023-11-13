public class Gato extends Animal implements Imprimible{ //implements interfaz (clase abstracta pura)

    @Override
    public void animalSound() {
        System.out.println("Miauuu");
    }

    @Override
    public void sleep() {
        System.out.println("rrrrrrrr");
    }

    @Override
    public String toString() {

        return "Son un gato";
    }

    @Override
    public void print() {
        System.out.println("Imprimindo gato...");
    }


}
