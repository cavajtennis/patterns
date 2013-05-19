package com.fang.patterns.factorypattern.nomal;

/**
 * 
 *
 * @author fangbingbing 2013-5-18 обнГ09:48:15
 */
public class Test {  
    
    public static void main(String[] args) {  
        Provider provider = new SendMailFactory();  
        Provider msgProvider = new SendSmsFactory();
        Sender sender = provider.produce();  
        sender.Send();  
        
        Sender sender2 = msgProvider.produce();
        sender2.Send();
    }  
}