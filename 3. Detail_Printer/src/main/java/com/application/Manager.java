package com.application;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Evan Lokajaya
 */
public class Manager extends Employee{
    private ArrayList<String> Documents;
    
    public Manager(String name, ArrayList documents){
        super(name);
        this.Documents = new ArrayList<String>(documents);
    }
    
    public Collection<String> getDocuments() {
        return Documents;
    }

    public void setDocuments(ArrayList<String> Documents) {
        this.Documents = Documents;
    }
    
    @Override
    public String toString(){
        return this.name + " : " +this.Documents.toString();
    }
}
