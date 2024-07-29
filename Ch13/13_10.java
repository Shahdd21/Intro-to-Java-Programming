public class Demo  {
    public static void main (String[] args) throws Exception {

        Rectangle r1 = new Rectangle(5,7);
        Rectangle r2 = new Rectangle(10,7);

        System.out.printf("The area of r1 : %f\n", r1.getArea());
        System.out.printf("The area of r2 : %f\n", r2.getArea());
        System.out.println("Are they equal ? " + r1.equals(r2));

    }

}

class Rectangle extends GeometricObject implements Comparable<Rectangle>{

    private double length;
    private double width;

    Rectangle(){
        super();
    }

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){
        return 2*(length+width);
    }

    @Override
    public int compareTo(Rectangle r){

        if(this.getArea() > r.getArea())
            return 1;

        else if(this.getArea() < r.getArea())
            return -1;
        else
            return 0;
    }

    @Override
    public boolean equals(Object r){

        if(this.compareTo((Rectangle)r) == 0)
            return true;

        else
            return false;
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
