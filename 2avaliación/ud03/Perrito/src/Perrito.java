

public class Perrito{

    String nome;
    String raza;
    String color;
    boolean chip;
    int numChip;

    public String ladrar() {
        return "Guau guau";
    }

    public String durmir() {
        return "Marcho durmir";
    }

    public void comer() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            System.out.println("Guau guau");
        }
    }
}
