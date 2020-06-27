package com.application;

import com.interfaces.ISecurityUI;

/**
 *
 * @author Evan LOkajaya
 */
public class KeyCardCheck extends SecurityCheck{
    private ISecurityUI securityUI;
    
    public KeyCardCheck(ISecurityUI secUI){
        this.securityUI = secUI;
    }
    
    private boolean isValid(String code){
        return true;
    }

    @Override
    public boolean validateUser() {
        String code = securityUI.RequestKeyCard();
        if(isValid(code)){
            return true;
        }
        
        return false;
    }
    
    
}
