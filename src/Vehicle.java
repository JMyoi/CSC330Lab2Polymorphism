class Vehicle {
    private String brand;
    private int year;

    Vehicle(){
        brand = "none";
        year = 0;
    }
    Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    public void start(){
        System.out.println("Vehicle started.");
    }
    public String getBrand(){
        return brand;
    }
    public int getYear(){
        return year;
    }

}
