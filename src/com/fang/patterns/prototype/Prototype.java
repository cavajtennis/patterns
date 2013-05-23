package com.fang.patterns.prototype;

import java.io.Serializable;

/**
 * Prototype模式
 * 
 * @author fangbingbing 2013-5-22 下午08:25:22
 */
public class Prototype implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;
    private Test              test;
    private int               i;

    /**
     * 浅复制
     */
    public Object clone() throws CloneNotSupportedException {
        Prototype proto = (Prototype) super.clone();
        return proto;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new Prototype();

        Test test = new Test();
        test.setString("test for clone");
        test.setValue(100);
        prototype.setTest(test);

        Prototype prototypeClone = (Prototype) prototype.clone();

        System.out.println(prototypeClone.getClass() == prototype.getClass());
        System.out.println(prototype.getClass());
        System.out.println(prototypeClone.getClass());
        System.out.println(prototypeClone);
        System.out.println(prototypeClone.equals(prototype));
        System.out.println(prototypeClone != prototype);

        prototype.setI(10);
        System.out.println("prototype i : " + prototype.getI());
        System.out.println("prototypeClone i : " + prototypeClone.getI());
        System.out.println("prototype test value : " + prototype.getTest().getValue());
        System.out.println("prototype test string : " + prototype.getTest().getString());
        System.out.println("prototypeClone test value : " + prototypeClone.getTest().getValue());
        System.out.println("prototypeClone test string : " + prototypeClone.getTest().getString());

        prototypeClone.setI(18);
        prototypeClone.getTest().setString("clone change");
        System.out.println("prototype i : " + prototype.getI());
        System.out.println("prototypeClone i : " + prototypeClone.getI());
        System.out.println("prototype test value : " + prototype.getTest().getValue());
        System.out.println("prototype test string : " + prototype.getTest().getString());
        System.out.println("prototypeClone test value : " + prototypeClone.getTest().getValue());
        System.out.println("prototypeClone test string : " + prototypeClone.getTest().getString());

    }

}

class Test {

    private int    value;

    private String string;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

}