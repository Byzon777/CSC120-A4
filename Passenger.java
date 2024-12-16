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
        try {
            c.addPassenger(this);
            System.out.println(name + " boarded the car.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * Gets off the passenger of specified car if the passenger is onboard.
     *
     * @param c the car to get off
     */
    public void getOffCar(Car c) {
        try {
            c.removePassenger(this); 
            System.out.println(name + " got off the car.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
