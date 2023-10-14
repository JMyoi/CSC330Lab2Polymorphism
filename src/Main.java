public class Main{

    public static void main(String[] args){
        Vehicle V = new Vehicle();
        Vehicle C = new Car("Porche", 2000);
        Vehicle M = new Motorcycle("Suzuki", 2023);
        Vehicle B = new Bicycle("Target", 2010);
        V.start();
        C.start();
        M.start();


        Vehicle VehicleArray[] = {V, C, M, B};
        System.out.println("starting all vehicles in array: ");
        for(int i = 0; i<VehicleArray.length; i++){
            VehicleArray[i].start();
        }
        System.out.println("Printing all vehicle info: ");
        for(int i = 0; i<VehicleArray.length; i++) {
            printVehicleInfo(VehicleArray[i]);
        }
    }

    public static void printVehicleInfo(Vehicle vehicle){
        System.out.println("Brand: "+ vehicle.getBrand() + "\nYear: "+ vehicle.getYear());
    }

}

