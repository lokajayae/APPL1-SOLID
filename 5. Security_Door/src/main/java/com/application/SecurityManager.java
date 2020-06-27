package com.application;

import java.util.Scanner;

/**
 *
 * @author Evan Lokajaya
 */
public class SecurityManager {
    private KeyCardCheck keyCardCheck;
    private PinCodeCheck pinCodeCheck;
    Scanner scanner;
    
    public SecurityManager(KeyCardCheck keyCardCheck, PinCodeCheck pinCodeCheck){
        this.keyCardCheck = keyCardCheck;
        this.pinCodeCheck = pinCodeCheck;
        scanner = new Scanner(System.in);
    }
    
    public void check(){
        System.out.println("Choose Option : ");
        System.out.println("1 : Key Card");
        System.out.println("2 : Pin Code");
        System.out.print("Option : ");
        int option = scanner.nextInt();
        
        switch(option){
            case 1 :
                System.out.println(this.keyCardCheck.validateUser());
            break;
            
            case 2 :
                System.out.println(this.pinCodeCheck.validateUser());
            break;
            
            default :
                System.out.println("Not Valid");
            break;
        }
    }
}
