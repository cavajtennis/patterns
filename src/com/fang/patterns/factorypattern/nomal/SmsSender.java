package com.fang.patterns.factorypattern.nomal;

/**
 * 
 *
 * @author fangbingbing 2013-5-18 ÏÂÎç08:22:01
 */
public class SmsSender implements Sender {  
    
    @Override  
    public void Send() {  
        System.out.println("this is sms sender!");  
    }  
}
