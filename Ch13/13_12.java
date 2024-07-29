public class Demo  {
    public static void main (String[] args) throws Exception {

        Circle c1 = new Circle(5.5);
        Circle c2 = new Circle(10.5);
        Rectangle r1 = new Rectangle(5,7);
        Rectangle r2 = new Rectangle(7,10);

        GeometricObject[] objects = {c1,c2,r1,r2};

        double areas = sumArea(objects);

        System.out.println("The sum of all areas is : " + areas);
    }

    public static double sumArea(GeometricObject[] objects){
        double sum = 0 ;

        for(int i=0 ;i < objects.length; ++i)
            sum += objects[i].getArea();

        return sum;
    }

}
abstract class GeometricObject {

    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;


    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }


    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public boolean isFilled() {
        return filled;
    }


    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}

class Circle extends GeometricObject {

    private double radius;

    public Circle() {

    }

    public Circle(double radius) {

        this.radius = radius;

    }

    public Circle(double radius, String color,
                  boolean filled) {

        this.radius = radius;
        setColor(color);
        setFilled(filled);

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRadius: " + getRadius() + "\nArea: "
                + getArea() + "\nPerimeter: " + getPerimeter();
    }

}

class Rectangle extends GeometricObject {

    private double width;
    private double height;

    public Rectangle() {
        width = 1;
        height = 1;
    }

    public Rectangle(double newWidth, double newHeight) {

        width = newWidth;
        height = newHeight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        double area = width * height;
        return area;
    }

    @Override
    public double getPerimeter() {

        return (2 * width) + (2 * height);
    }

    @Override
    public String toString() {
        return super.toString() + "\nWidth: " + width + "\nHeight: " + height
                + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }


}
