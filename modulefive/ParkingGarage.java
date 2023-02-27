package modulefive;

import java.util.*;


public class ParkingGarage {

    //Write a class ParkingGarage which simulates a garage for parking Vehicles. The garage should have have enough capacity to park 20 Vehicles or 25,000 pounds. It should refuse to park any Vehicle that would push the garage over either of these limits. Note that ParkingGarage should be a well-behaved class; in particular, it should be possible to create multiple independent ParkingGarages in one program.
    // ParkingGarage should have a main routine which demonstrates its capabilities. main( ) need not accept any user input.
    int capacityVehicles = 0;
    int capacityWeight  = 0;
    private ArrayList<Vehicle> garageList = new ArrayList<Vehicle>();
    
    

    //This class will take as an input a vehicle obj
    public void parkCar(Vehicle vehicle){
        int vehicleWeight = vehicle.getWeightInPounds();

        if (capacityWeight + vehicleWeight <= 25000 && capacityVehicles < 20 && !garageList.contains(vehicle)){
            capacityVehicles += 1;
            capacityWeight += vehicleWeight;
            garageList.add(vehicle);
            
        }
        else if (garageList.contains(vehicle)) {
            System.out.println("Vehicle already parked in this garage.");
        }
        else if (capacityWeight + vehicleWeight > 25000){
            System.out.println("Garage at weight capacity!");
        }
        else{
            System.out.println("Garage at vehicle capacity");
        }
        
    }

    public void removeCar(Vehicle vehicle){
        if (garageList.contains(vehicle)){
            garageList.remove(vehicle);
            capacityVehicles -= 1;
            capacityWeight -= vehicle.getWeightInPounds();
        }else{
            System.out.println("Vehicle is not parked in this garage");
        }
    }

    public void showCars(){
        if (garageList.size() > 0){
            System.out.println("Here are all the cars parked in the garage:");
            for (Vehicle v : garageList){
                System.out.println(v.getClass().getName());
            }
        }
    }

    public void emptyGarage(){
        garageList.clear();
        capacityVehicles = 0;
        capacityWeight = 0;
    }

    public int spacesUsed(){
        return garageList.size();
    }

    public int garageWeight(){
        return capacityWeight;
    }

    public static void main(String[] args){
        //create vehicles
        MercedesC230 m1 = new MercedesC230();
        SubaruOutback su1 = new SubaruOutback();
        ParkingGarage pg = new ParkingGarage();

        //Adding Vehicles to garage
        pg.parkCar(m1);
        pg.parkCar(su1);

        //add vehicle # that exceeds capacity
        System.out.println("Demostrating number capacity:");
        for (int i = 0; i < 18; i++){
            SubaruOutback Su = new SubaruOutback();
            pg.parkCar(Su);
        }

        //show the cars parked
        pg.showCars();
        System.out.println("Number of cars in Garage: " + pg.spacesUsed());
        System.out.println("Garage Weight: " + pg.garageWeight() + "lbs");
        
        

        //Removing cars from garage
        System.out.println("Emptying Garage");
        pg.emptyGarage();
        

        //add weights that exceed the weight capacity
        System.out.println("Demostarting weight capacity: ");
        for (int i  = 0; i < 11; i++){
            ChevyS10 s = new ChevyS10();
            pg.parkCar(s);
        }

        //show the cars parked
        pg.showCars();
        System.out.println("Number of cars in Garage: " + pg.spacesUsed());
        System.out.println("Garage Weight: " + pg.garageWeight() + "lbs");

        
        

       




    }

}
