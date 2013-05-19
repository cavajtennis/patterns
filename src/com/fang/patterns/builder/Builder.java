package com.fang.patterns.builder;

import java.util.ArrayList;
import java.util.List;

import com.fang.patterns.factorypattern.nomal.MailSender;
import com.fang.patterns.factorypattern.nomal.Sender;
import com.fang.patterns.factorypattern.nomal.SmsSender;

/**
 * 建造者模式
 * 
 * @author fangbingbing 2013-5-19 下午06:42:38
 */
public class Builder {

    private List<Sender> list = new ArrayList<Sender>();

    public void produceMailSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
    }
}
