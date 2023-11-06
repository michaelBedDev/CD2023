package cd2023.ud5;

public class Perrito{

    String nome;
    String raza;
    String color;
    boolean chip;
    int numChip;

    public void ladrar() {
        System.out.println("Guau guau");

    }

    public void durmir() {
        System.out.println("Marcho durmir");
    }

    public void comer() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            System.out.println("Guau guau");
        }
    }
}
