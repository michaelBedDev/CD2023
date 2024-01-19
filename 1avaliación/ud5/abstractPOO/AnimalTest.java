package ud5.abstractPOO;
public class AnimalTest {
    public static void main(String[] args) {
        Gato gato = new Gato();  //Variable animal clase Gato
        gato.animalSound();
        gato.sleep();
        /*Animal can = new Can();
        can.animalSound();*/
        System.out.println(gato);
        gato.print();
    }
}
