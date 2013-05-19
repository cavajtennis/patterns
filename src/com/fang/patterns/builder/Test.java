package com.fang.patterns.builder;

/**
 * @author fangbingbing 2013-5-19 ÏÂÎç06:43:24
 */
public class Test {

    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produceMailSender(10);
    }
}