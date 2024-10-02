import java.util.ArrayList;

/**
 * Represents a train consisting of an engine and multiple cars.
 */
public class Train {
    private Engine engine;
    private ArrayList<Car> cars;
    
    /**
     * Constructs a train with the specified parameters.
     *
     * @param fuelType         the type of fuel for the engine
     * @param fuelCapacity     the maximum fuel capacity of the engine
     * @param nCars            the number of cars in the train
     * @param passengerCapacity the maximum passenger capacity per car
     */

    public Train(FuelType fuelType, double maxCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(fuelType, passengerCapacity);
        this.cars = new ArrayList<>(nCars);
        for (int i = 0; i < nCars; i++){
            cars.add(new Car(passengerCapacity));
        }
    }
    /**
     * Gets the engine of the train.
     *
     * @return the engine of the train
     */
    public Engine getEngine(){
        return engine;
    }

    /**
     * Gets the car at the specified index.
     *
     * @param i the index of the car
     * @return the car at the specified index, or null if index is out of bounds
     */
    public Car getCar(int i){
        if(i>=0 && i < cars.size()){
            return cars.get(i);
        }
        return null;
    }

    /**
     * Calculates the maximum capacity of the train.
     *
     * @return the maximum capacity of the train
     */
    public int getMaxCapacity(){
        int totalEngineCapacity = 0;
        for (Car car: cars){
            totalEngineCapacity += car.getmaxCapacity();
        }
        return totalEngineCapacity;
    }

    /**
     * Calculates the remaining seats in the train.
     *
     * @return the remaining seats in the train
     */
    public int engineSeatsRemaining(){
        int totalEngineSeatsRemaining = 0;
        for (Car car: cars){
            totalEngineSeatsRemaining += car.seatsRemaining();
        }
        return totalEngineSeatsRemaining;
    }
    
    /**
     * Prints the manifest of passengers onboard the train.
     */
    public void printManifest(){
        for (Car car : cars){
            car.printManifest();
        }
    }

    public static void main(String[] args) {
        Train train = new Train(FuelType.STEAM, 200.0, 3, 2);

        Passenger p1 = new Passenger("Alice");
        Passenger p2 = new Passenger("Bob");
        Passenger p3 = new Passenger("Charlie");

        p1.boardCar(train.getCar(0));
        p2.boardCar(train.getCar(0));
        p3.boardCar(train.getCar(1));

        train.printManifest();
        System.out.println("Seats remaining: " + train.engineSeatsRemaining());
    }
    
}
