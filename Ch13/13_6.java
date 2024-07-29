public class Demo  {
    public static void main (String[] args) throws Exception {

        ComparableCircle c1 = new ComparableCircle(5.5);
        ComparableCircle c2 = new ComparableCircle(10.0);

        int res = c1.compareTo(c2);

        if(res > 0 )
            System.out.println("The greater circle is c1");
        else if (res == 0)
            System.out.println("Both are equal");
        else
            System.out.println("The greater circle is c2");
    }

}

class ComparableCircle extends Circle implements Comparable<ComparableCircle>{

    private double radius;

    ComparableCircle(){

    }

    ComparableCircle(double radius){
        this.radius = radius;
    }

    @Override
    public int compareTo(ComparableCircle o1){

        if(this.area() > o1.area())
            return 1;

        else if(this.area() == o1.area())
            return 0;

        else
            return -1;
    }
}

class Circle{

    private double radius;

    Circle(){
        radius = 1.0;
    }

    Circle(double radius){
        this.radius = radius;
    }

    public double area(){
        return radius*radius*3.14 ;
    }
}
