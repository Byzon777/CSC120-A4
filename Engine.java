/**
 * Represents an engine that powers a train.
 */
public class Engine {

    private double maxFuel;
    private double currentFuel;
    private FuelType fuelType;

     /**
     * Constructs an Engine object with the specified fuel type and maximum fuel capacity.
     *
     * @param fuelType   the type of fuel used by the engine
     * @param maxFuel    the maximum fuel capacity of the engine
     */

    public Engine(FuelType fuelType, double maxFuel){
        this.fuelType = fuelType;
        this.maxFuel = maxFuel;
        this.currentFuel = maxFuel;
    }
    /**
     * Gets the fuel type of the engine.
     *
     * @return the fuel type of the engine
     */
    public FuelType getFuelType(){
        return fuelType;
    }

    /**
     * Gets the maximum fuel capacity of the engine.
     *
     * @return the maximum fuel capacity of the engine
     */
    public double getmaxFuel(){
        return maxFuel;
    }

    /**
     * Gets the current fuel level of the engine.
     *
     * @return the current fuel level of the engine
     */
    public double getcurrentFuel(){
        return currentFuel;
    }

    /**
     * Refuels the engine, resetting the current fuel level to the maximum capacity.
     */
    public void refuel(){
        this.currentFuel = maxFuel;
    } 
    /**
     * Simulates the operation of the engine by decreasing the current fuel level.
     *
     * @return true if the engine can continue operating (fuel level > 0), false otherwise
     */
    
    public boolean go(){
        if(currentFuel>0){
            currentFuel -= 5;
            System.out.println("Current fuel level:" + currentFuel);
            return currentFuel>0;
        }else{
            return false;
        }
    }
}