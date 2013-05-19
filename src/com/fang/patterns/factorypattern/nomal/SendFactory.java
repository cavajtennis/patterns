package com.fang.patterns.factorypattern.nomal;

/**
 * ��������ģʽ
 *
 * @author fangbingbing 2013-5-18 ����08:21:34
 */
public class SendFactory {  
    
    public Sender produce(String type) {  
        if ("mail".equals(type)) {  
            return new MailSender();  
        } else if ("sms".equals(type)) {  
            return new SmsSender();  
        } else {  
            System.out.println("��������ȷ������!");  
            return null;  
        }  
    }  
    
} 
