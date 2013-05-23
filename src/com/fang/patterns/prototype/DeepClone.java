package com.fang.patterns.prototype;

/**
 * Éî¸´ÖÆ
 * 
 * @author fangbingbing 2013-5-22 ÏÂÎç09:38:41
 */
public class DeepClone {

    public static void main(String[] args) throws CloneNotSupportedException {
        
        DeepTest deepTest = new DeepTest();
        deepTest.setString("deepTest deep clone");
        deepTest.setValue(100);
        
        Nest nest = new Nest();
        nest.setDeepTest(deepTest);
        nest.setNestName("nest");
        
        Nest nestClone = (Nest) nest.clone();
        
        System.out.println(nest.getClass() == nestClone.getClass());
        System.out.println(nest.equals(nestClone));
        
        System.out.println("nest string : " + nest.getNestName());
        System.out.println("nest deepTest : " + nest.getDeepTest());
        System.out.println("nest deepTest string : " + nest.getDeepTest().getString());
        System.out.println("nest deepTest value : " + nest.getDeepTest().getValue());
        System.out.println("nest clone string : " + nestClone.getNestName());
        System.out.println("nest clone deepTest : " + nestClone.getDeepTest());
        System.out.println("nest clone deepTest string : " + nestClone.getDeepTest().getString());
        System.out.println("nest clone deepTest value : " + nestClone.getDeepTest().getValue());
        
        nestClone.setNestName("nestClone");
        nestClone.getDeepTest().setString("nestClone deep clone");
        nestClone.getDeepTest().setValue(101);
        System.out.println(" test change --------------------");
        
        System.out.println("nest string : " + nest.getNestName());
        System.out.println("nest deepTest : " + nest.getDeepTest());
        System.out.println("nest deepTest string : " + nest.getDeepTest().getString());
        System.out.println("nest deepTest value : " + nest.getDeepTest().getValue());
        System.out.println("nest clone string : " + nestClone.getNestName());
        System.out.println("nest clone deepTest : " + nestClone.getDeepTest());
        System.out.println("nest clone deepTest string : " + nestClone.getDeepTest().getString());
        System.out.println("nest clone deepTest value : " + nestClone.getDeepTest().getValue());
        
    }

}

class DeepTest implements Cloneable {

    @Override
    public Object clone() throws CloneNotSupportedException {
        DeepTest deepTest = (DeepTest) super.clone();
        return deepTest;
    }

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

class Nest implements Cloneable {

    @Override
    public Object clone() throws CloneNotSupportedException {
        Nest nest = (Nest) super.clone();
        nest.setDeepTest((DeepTest) nest.getDeepTest().clone());
        return nest;
    }

    private DeepTest deepTest;

    private String   nestName;

    public DeepTest getDeepTest() {
        return deepTest;
    }

    public void setDeepTest(DeepTest deepTest) {
        this.deepTest = deepTest;
    }

    public String getNestName() {
        return nestName;
    }

    public void setNestName(String nestName) {
        this.nestName = nestName;
    }

}