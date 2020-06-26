package com.model;

import com.interfaces.IStreamable;

/**
 *
 * @author Evan Lokajaya
 */
public class StreamProgressInfo {
    IStreamable file;
    
    public StreamProgressInfo(IStreamable file){
        this.file = file;
    }
    
    public int CalculateCurrentPercent(){
        return file.getBytesSent() * 100 / file.getLength();
    }
}
