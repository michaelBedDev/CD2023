package ud5.interfaces;

public class Circle implements IShape{
    private double radius;

    @Override
    public double getArea() {
        double area = Math.PI*Math.pow(radius, 2);
        return area;
    }

}
