package com.fang.patterns.factorypattern.nomal;

/**
 * 
 *
 * @author fangbingbing 2013-5-18 ÏÂÎç08:21:51
 */
public class MailSender implements Sender {  
    @Override  
    public void Send() {  
        System.out.println("this is mailsender!");  
    }  
}