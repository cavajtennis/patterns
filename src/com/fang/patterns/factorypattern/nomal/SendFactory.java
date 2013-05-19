package com.fang.patterns.factorypattern.nomal;

/**
 * 工厂方法模式
 *
 * @author fangbingbing 2013-5-18 下午08:21:34
 */
public class SendFactory {  
    
    public Sender produce(String type) {  
        if ("mail".equals(type)) {  
            return new MailSender();  
        } else if ("sms".equals(type)) {  
            return new SmsSender();  
        } else {  
            System.out.println("请输入正确的类型!");  
            return null;  
        }  
    }  
    
} 
