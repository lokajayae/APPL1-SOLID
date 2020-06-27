/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Tigress
 */
public abstract class Worker {
    private String id;
    private int workingHours;
    
    public Worker(String id){
        this.id = id;
        this.workingHours = 0;
    }
    
    
    public void Work(int hours){
        this.workingHours += hours;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
