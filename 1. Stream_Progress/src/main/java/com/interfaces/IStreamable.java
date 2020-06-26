package com.interfaces;

/**
 *
 * @author Evan Lokajaya
 */
public abstract class IStreamable {
    int length;
    int bytesSent;
    
    public int getLength(){
        return length;
    }
    
    public int getBytesSent(){
        return bytesSent;
    }
    
    public void setLength(int length){
        this.length = length;
    }
    
    public void setBytesSent(int bytesSent){
        this.bytesSent = bytesSent;
    }
}   
