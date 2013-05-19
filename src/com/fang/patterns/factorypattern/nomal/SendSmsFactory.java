package com.fang.patterns.factorypattern.nomal;

/**
 * 
 *
 * @author fangbingbing 2013-5-18 ����09:46:49
 */
public class SendSmsFactory implements Provider{  
    
    @Override  
    public Sender produce() {  
        return new SmsSender();  
    }  
}  
