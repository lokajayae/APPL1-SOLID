package com.application;

import com.interfaces.ISecurityUI;
import java.util.Scanner;

/**
 *
 * @author Evan Lokajaya
 */
public class ScannerUI extends ISecurityUI{
    Scanner scanner = new Scanner(System.in);
    
    @Override
    public String RequestKeyCard() {
        System.out.print("Slide your Keycard : ");
        return scanner.nextLine();
    }

    @Override
    public int RequestPinCode() {
        System.out.print("Enter your Pin Code : ");
        return scanner.nextInt();
    }
    
}
