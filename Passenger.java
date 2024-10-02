/**
 * Represents a passenger who can board and get off a car.
 */
public class Passenger {
    
    private String name;

    /**
     * Constructs a passenger with the specified name.
     *
     * @param name the name of the passenger
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the passenger.
     *
     * @return the name of the passenger
     */
    public String getName(){
        return name;
    }

    /**
     * Boards the specified car if there is available space.
     *
     * @param c the car to board
     */

    public void boardCar(Car c){
        if (c.addPassenger(this)) {
            System.out.println(name + " boarded the car.");
        } else {
            System.out.println("Sorry, " + name + ", the car is full. You cannot board.");
        }
    }
    
    /**
     * Gets off the passenger of specified car if the passenger is onboard.
     *
     * @param c the car to get off
     */
    public void getOffCar(Car c) {
        if (c.removePassenger(this)) {
            System.out.println(name + " got off the car.");
        } else {
            System.out.println(name + " was not onboard the car.");
        }
    }

}
