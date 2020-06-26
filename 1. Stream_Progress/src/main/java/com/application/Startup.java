package com.application;

import com.model.*;

/**
 *
 * @author Evan Lokajaya
 */
public class Startup {
    public static void main (String[] args) { 
        File file = new File("Test", 12, 12);
        Music music = new Music("Some Name", "Cool", 15, 2222);
        
        StreamProgressInfo streamFileInfo;
        streamFileInfo = new StreamProgressInfo(file);
        
        StreamProgressInfo streamMusicInfo;
        streamMusicInfo = new StreamProgressInfo(music);
        
        System.out.println(streamFileInfo.CalculateCurrentPercent());
        System.out.println(streamMusicInfo.CalculateCurrentPercent());
    }
}
