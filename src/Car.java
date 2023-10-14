public class Car extends Vehicle{
    Car(){
    }
    Car(String brand, int year){
        super(brand,year);
    }

    @Override
    public void start(){
        System.out.println("Car Started.");
    }

}
