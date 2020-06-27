package com.application;

/**
 *
 * @author Evan Lokajaya
 */
public class Program {
    public static void main(String args[]){
        ScannerUI scanner = new ScannerUI();
        KeyCardCheck keyCardCheck = new KeyCardCheck(scanner);
        PinCodeCheck pinCodeCheck = new PinCodeCheck(scanner);
        SecurityManager securityManager = new SecurityManager(keyCardCheck, pinCodeCheck);
        
        securityManager.check();
    } 
}
