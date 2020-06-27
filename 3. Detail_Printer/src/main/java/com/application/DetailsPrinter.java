package com.application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Evan Lokajaya
 */
public class DetailsPrinter {
    private ArrayList<Employee> employees;
    
    public DetailsPrinter(ArrayList<Employee> employees){
        this.employees = employees;
    }
    
    public void printDetails(){
        for(Employee e : employees){
           System.out.println(e);
        }
    }
}
