package Level1;
class Vehicle{
    int maxSpeed;
    String fuelType;
    Vehicle(int maxSpeed,String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }
    void display(){
        System.out.println("display details");
    }
}
class Car extends Vehicle{
    int seatCapacity;
    Car(int maxSpeed,String fuelType,int seatCapacity){
        super(maxSpeed,fuelType);
        this.seatCapacity=seatCapacity;
    }
    void display(){
        System.out.println("Max speed for car is: "+maxSpeed);
        System.out.println("Fuel type: "+fuelType);
        System.out.println("Seat capacity: "+seatCapacity);
    }
}
class Truck extends Vehicle{
    int seatCapacity;
    Truck(int maxSpeed,String fuelType,int seatCapacity){
        super(maxSpeed,fuelType);
        this.seatCapacity=seatCapacity;
    }
    void display(){
        System.out.println("Max speed for Truck is: "+maxSpeed);
        System.out.println("Fuel type: "+fuelType);
        System.out.println("Seat capacity: "+seatCapacity);
    }
}
class Motorcycle extends Vehicle{
    int seatCapacity;
    Motorcycle(int maxSpeed,String fuelType,int seatCapacity){
        super(maxSpeed,fuelType);
        this.seatCapacity=seatCapacity;
    }
    void display(){
        System.out.println("Max speed for motorcycle is: "+maxSpeed);
        System.out.println("Fuel type: "+fuelType);
        System.out.println("Seat capacity: "+seatCapacity);
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
       Vehicle[] vehicle=new Vehicle[3];
       vehicle[0]=new Car(200,"Diesel",8);
       vehicle[1]=new Truck(140,"Diesel",3);
       vehicle[2]=new Motorcycle(180,"Petrol",2);
       vehicle[0].display();
       vehicle[1].display();
       vehicle[2].display();
    }
}
