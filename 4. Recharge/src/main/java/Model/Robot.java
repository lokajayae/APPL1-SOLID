package Model;

import Interfaces.IRechargeable;

/**
 *
 * @author Evan Lokajaya
 */
public class Robot extends Worker implements IRechargeable{
    String id;
    private int capacity;
    private int currentPower;
    
    public Robot(String id, int capacity){
        super(id);
        this.capacity = capacity;
    }
    
    public int getCapacity(){
        return this.capacity;
    }
    
    public int getCurrentPower(){
        return this.currentPower;
    }
    
    public void setCurrentPower(int power){
        this.currentPower = power;
    }
    @Override
    public void Recharge() {
        this.currentPower = this.capacity;
    }
    
}
