package Group.CodingTasks;

public class Task1 {
    /*
    Create an interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
    Create 2 classes Circle & Square that implements functionality defined in the Shape Interface
    Test your code.
     */
}

interface Shape{
    double caclculateArea();
    double calculatePerimeter();
}

class Circle implements Shape{

     double radius;


    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double caclculateArea() {
        double Area;
        Area=(Math.PI)*(Math.pow(this.radius,2));
        return Area;
    }

    @Override
    public double calculatePerimeter() {
        double Perimiter;
        Perimiter=2*Math.PI*this.radius;
        return Perimiter;
    }

    public static void main(String[] args) {

        Circle circle=new Circle();
        circle.setRadius(45);
        System.out.println(circle.caclculateArea());
        System.out.println(circle.calculatePerimeter());

    }


}
class Square implements Shape{

    double side;

    void setSide(double side){
        this.side=side;
    }

   double getSide(){
        return side;
   }

    @Override
    public double caclculateArea() {
        double Area=Math.pow(side,2);
        return Area;
    }

    @Override
    public double calculatePerimeter() {
        double Perimeter;
        Perimeter=side*4;
        return Perimeter;
    }

    public static void main(String[] args) {
        Square square=new Square();
        square.setSide(5);
        System.out.println(square.caclculateArea());
        System.out.println(square.calculatePerimeter());

    }
}
