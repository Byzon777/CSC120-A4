import java.util.ArrayList;
/* Represents a car as a container for passengers */
public class Car {

    private ArrayList<Passenger> passengers;
    private int maxCapacity;

    /**
     * Constructs a car object with the specified parameters.
     *
     * @param maxCapacity the maximum passenger capacity in car
     */
    public Car(int maxCapacity){
        this.passengers = new ArrayList<>(maxCapacity);
        this.maxCapacity = maxCapacity;
    }

    /**
     * Gets the list of the passengers.
     *
     * @return the list of the passengers
     */
    public ArrayList<Passenger> getArrayList(){
        return passengers;
    }

    /**
     * Gets the maximum number of passengers in car.
     *
     * @return maximum number of passengers in car
     */
    public int getCapacity(){
        return maxCapacity;
    }

    /**
     * Gets the number of seats remaining in the car.
     *
     * @return Gets the number of seats remaining in the car
     */
    public int seatsRemaining(){
        return maxCapacity - passengers.size();
    }

    /**
     * Boards the the passenger if there is available space.
     *
     * @param p the passenger to board
     * @return status of whether passenger was able to board successfuly or not
     */
    public boolean addPassenger(Passenger p){
        if(passengers.contains(p)){
            throw new RuntimeException("Passenger is already onboard");
        }
        if(seatsRemaining()<=0){
            throw new RuntimeException("Car is full, please try another car");
        }
        passengers.add(p);
        return true;
    }
    /**
     * Gets off the passenger if the passenger is onboard.
     *
     * @param p the passenger to get off
     * @return status of whether passenger was able to unboard successfuly or not
     */
    public boolean removePassenger(Passenger p) {
        if(!passengers.contains(p)){
            throw new RuntimeException("Passenger is not onboard");
        } else {
            passengers.remove(p);
            return true;
        }
    }

    /**
     * Prints the manifest of passengers onboard the car.
     */
    public void printManifest(){
        if(passengers.isEmpty()){
            System.out.println("This car is EMPTY.");
        } else {
            for(Passenger p: passengers){
                System.out.println(p.getName());
            }
        }
    }

}