package com.fang.patterns.factorypattern.nomal;

/**
 * 
 *
 * @author fangbingbing 2013-5-18 ����09:46:29
 */
public class SendMailFactory implements Provider {  
      
    @Override  
    public Sender produce(){  
        return new MailSender();  
    }  
} 
