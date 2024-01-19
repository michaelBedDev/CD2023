public interface FiguraGeometrica {
double calcularArea();
double calcularPerimetro();
}
public abstract class Figura2D implements FiguraGeometrica {
}
public abstract class Figura3D implements FiguraGeometrica {
}
public class Rectangulo extends Figura2D {
private double longitud;
private double anchura;
}
public class Circulo extends Figura2D {
private double radio;
}
public class Cubo extends Figura3D {
private double longitudArista;
}
public class Esfera extends Figura3D {
private double radio;
}

// Path: cd2023/ej3/CalculadoraAreas.java
