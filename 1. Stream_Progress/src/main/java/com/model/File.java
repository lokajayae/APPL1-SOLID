package com.model;

import com.interfaces.IStreamable;

/**
 *
 * @author Evan Lokajaya
 */
public class File extends IStreamable{
    private String name;
    
    public File(String name, int length, int bytesSent){
        this.name = name;
        super.setLength(length);
        super.setBytesSent(bytesSent);
    }
    
    @Override
    public int getLength(){
        return super.getLength();
    }
    
    @Override
    public int getBytesSent(){
        return super.getBytesSent();
    }
    
    @Override
    public void setLength(int length){
        super.setLength(length);
    }
    
    @Override
    public void setBytesSent(int bytesSent){
        super.setBytesSent(bytesSent);
    }
}
