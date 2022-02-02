package com.homework;

public class HomeWork07 {
}


class Test {
    String name = "Rose";

    public Test() {
        System.out.println("Test");
    }

    public Test(String name) {
        this.name = name;
    }
}

class Demo extends Test {
    String name = "Jack";

    Demo() {
        super();
        System.out.println("Demo");
    }

    Demo(String s) {
        super(s);
    }

    public void test() {
        System.out.println(super.name);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        new Demo().test();
        new Demo("john").test();
    }
}

// Test  Demo Rose Jack
// John Jack
