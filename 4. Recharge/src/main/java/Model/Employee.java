package Model;

import Interfaces.ISleeper;

/**
 *
 * @author Evan Lokajaya
 */
public class Employee extends Worker implements ISleeper{
    
    public Employee(String id){
        super(id);
    }

    @Override
    public void Sleep() {
        
    }
}
