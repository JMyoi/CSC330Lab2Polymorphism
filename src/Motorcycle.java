public class Motorcycle extends Vehicle{
    Motorcycle(){}
    Motorcycle(String brand, int year){
        super(brand, year);
    }

    @Override
    public void start(){
        System.out.println("Motorcycle Started.");
    }
}
