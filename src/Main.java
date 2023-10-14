public class Main{

    public static void main(String[] args){
        //part 1
        System.out.println("Part 1: ");
        Vehicle V = new Vehicle();
        Vehicle C = new Car("Porche", 2000);
        Vehicle M = new Motorcycle("Suzuki", 2023);
        V.start();
        C.start();
        M.start();

        System.out.println("Part 2: ");

        Vehicle VehicleArray[] = {V, C, M};

        for(int i = 0; i<VehicleArray.length; i++){
            VehicleArray[i].start();
        }
        for(int i = 0; i<VehicleArray.length; i++){
            printVehicleInfo(VehicleArray[i]);
        }

    }

    public static void printVehicleInfo(Vehicle vehicle){
        System.out.println("Brand: "+ vehicle.getBrand() + "\nYear: "+ vehicle.getYear());
    }

}

