package Group.CodingTasks;

public class Task3 {
}

abstract class Car{

    double carPrice;
    String color;

    abstract double calculateSalePrice();

}
class Truck extends Car{

   private double weight;
   private double discount;

    void setWeight(double weight){
        this.weight=weight;
    }

    void setPrice(double carPrice){
        this.carPrice=carPrice;
    }

    void setDiscount(double weight){
        this.discount=discount;
        if(weight>2000){
            discount=.10;
        }else{
            discount=.20;
        }
    }
    @Override
    double calculateSalePrice() {
        double salePrice;
        setDiscount(weight);
        salePrice=carPrice-(carPrice*discount);
        return salePrice;
    }

    public static void main(String[] args) {
        Truck truck=new Truck();
        truck.setPrice(45000);
        truck.setWeight(1900);
        System.out.println(truck.calculateSalePrice());
    }
}
class Sedan extends Car{
    private double length;
    private double discount;

    void setDiscount(double length){
        this.discount=discount;
        if(length>20){
            discount=.05;
        }else{
            discount=.1;
        }
    }
    void setLength(double length){
        this.length=length;
    }

    void setPrice(double carPrice){
        this.carPrice=carPrice;
    }

    @Override
    double calculateSalePrice() {
        double salePrice;
        setDiscount(length);
        salePrice=carPrice-(carPrice*discount);
        return salePrice;
    }

    public static void main(String[] args) {
        Sedan sedan=new Sedan();
        sedan.setLength(19);
        sedan.setPrice(30000);
        System.out.println(sedan.calculateSalePrice());
    }
}
