public class Bicycle extends Vehicle{
    Bicycle(){};
    Bicycle(String brand, int year){
        super(brand, year);
    }
    public void start(){
        System.out.println("Bicycle Started.");
    }
}
