package ud5.interfaces;

public class Rectangle implements IShape{

    private double width;
    private double height;


    @Override
    public double getArea() {
        double area = this.width*this.height;
        return area;
    }
}
