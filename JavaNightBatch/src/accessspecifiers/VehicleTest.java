package accessspecifiers;

//Base class Vehicle
abstract class Vehicle {
 protected String make;
 protected String model;
 protected int year;
 protected String fuelType;

 // Constructor
 public Vehicle(String make, String model, int year, String fuelType) {
     this.make = make;
     this.model = model;
     this.year = year;
     this.fuelType = fuelType;
 }

 // Abstract method to calculate fuel efficiency
 public abstract double calculateFuelEfficiency();

 // Abstract method to calculate distance traveled
 public abstract double calculateDistanceTraveled(double fuelAmount);

 // Abstract method to get maximum speed
 public abstract double getMaxSpeed();

 // Display basic vehicle info
 public void displayVehicleInfo() {
     System.out.println("Make: " + make);
     System.out.println("Model: " + model);
     System.out.println("Year: " + year);
     System.out.println("Fuel Type: " + fuelType);
 }
}

//Subclass Truck
class Truck extends Vehicle {
 private double loadCapacity;  // In tons

 public Truck(String make, String model, int year, String fuelType, double loadCapacity) {
     super(make, model, year, fuelType);
     this.loadCapacity = loadCapacity;
 }

 @Override
 public double calculateFuelEfficiency() {
     return 15 - (loadCapacity * 0.5);  // Simplified formula based on load capacity
 }

 @Override
 public double calculateDistanceTraveled(double fuelAmount) {
     return calculateFuelEfficiency() * fuelAmount;  // Distance = fuel efficiency * fuel amount
 }

 @Override
 public double getMaxSpeed() {
     return 120 - (loadCapacity * 2);  // Simplified formula based on load capacity
 }

 @Override
 public void displayVehicleInfo() {
     super.displayVehicleInfo();
     System.out.println("Load Capacity: " + loadCapacity + " tons");
 }
}

//Subclass Car
class Car extends Vehicle {
 private int numberOfDoors;

 public Car(String make, String model, int year, String fuelType, int numberOfDoors) {
     super(make, model, year, fuelType);
     this.numberOfDoors = numberOfDoors;
 }

 @Override
 public double calculateFuelEfficiency() {
     return 30 + (numberOfDoors > 4 ? 2 : 0);  // More doors might reduce efficiency slightly
 }

 @Override
 public double calculateDistanceTraveled(double fuelAmount) {
     return calculateFuelEfficiency() * fuelAmount;  // Distance = fuel efficiency * fuel amount
 }

 @Override
 public double getMaxSpeed() {
     return 180;
 }

 @Override
 public void displayVehicleInfo() {
     super.displayVehicleInfo();
     System.out.println("Number of Doors: " + numberOfDoors);
 }
}

//Subclass Motorcycle
class Motorcycle extends Vehicle {
 private boolean hasSidecar;

 public Motorcycle(String make, String model, int year, String fuelType, boolean hasSidecar) {
     super(make, model, year, fuelType);
     this.hasSidecar = hasSidecar;
 }

 @Override
 public double calculateFuelEfficiency() {
     return 50 + (hasSidecar ? -5 : 0);  // Sidecar reduces fuel efficiency
 }

 @Override
 public double calculateDistanceTraveled(double fuelAmount) {
     return calculateFuelEfficiency() * fuelAmount;  // Distance = fuel efficiency * fuel amount
 }

 @Override
 public double getMaxSpeed() {
     return 200;
 }

 @Override
 public void displayVehicleInfo() {
     super.displayVehicleInfo();
     System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
 }
}

//Main class to test the vehicle hierarchy
public class VehicleTest {
 public static void main(String[] args) {
     // Create instances of Truck, Car, and Motorcycle
     Truck truck = new Truck("Ford", "F-150", 2020, "Gasoline", 3.5);
     Car car = new Car("Toyota", "Camry", 2021, "Hybrid", 4);
     Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Street 750", 2022, "Gasoline", true);

     // Display information for each vehicle
     System.out.println("Truck Info:");
     truck.displayVehicleInfo();
     System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " mpg");
     System.out.println("Distance Traveled with 10 gallons: " + truck.calculateDistanceTraveled(10) + " miles");
     System.out.println("Max Speed: " + truck.getMaxSpeed() + " mph\n");

     System.out.println("Car Info:");
     car.displayVehicleInfo();
     System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " mpg");
     System.out.println("Distance Traveled with 10 gallons: " + car.calculateDistanceTraveled(10) + " miles");
     System.out.println("Max Speed: " + car.getMaxSpeed() + " mph\n");

     System.out.println("Motorcycle Info:");
     motorcycle.displayVehicleInfo();
     System.out.println("Fuel Efficiency: " + motorcycle.calculateFuelEfficiency() + " mpg");
     System.out.println("Distance Traveled with 10 gallons: " + motorcycle.calculateDistanceTraveled(10) + " miles");
     System.out.println("Max Speed: " + motorcycle.getMaxSpeed() + " mph");
 }
}

