package com.edu.modifier;

public class B {
    //
    public void say() {
        A a = new A();
        //在同一个包下 public protected 和默认
        System.out.println(a.n1);
        System.out.println(a.n2);
        System.out.println(a.n3);
    }
}
