package com.model;

import com.interfaces.IStreamable;

/**
 *
 * @author Evan Lokajaya
 */
public class Music extends IStreamable {
    private String artist;
    private String album;
    
    public Music(String artist, String album, int length, int bytesSent){
        this.artist = artist;
        this.album = album;
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
