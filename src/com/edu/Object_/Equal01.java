package com.edu.Object_;


public class Equal01 {

    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == c); //true
        B bObj = a;

        System.out.println(bObj == c); // true

        int num = 10;
        double num2 = 10.0;

        System.out.println(num == num2); // true

        // equals 只能判断引用类型

        "hello".equals("abc");

        Integer integer1 = new Integer(1000);
        Integer integer2 = new Integer(1000);

        System.out.println(integer1 == integer2); // false
        System.out.println(integer1.equals(integer2)); // true
        Integer integer3 = new Integer(4);
        Integer integer4 = new Integer(4);

        System.out.println(integer1 == integer2); // true 常量池
    }
}

class B {

}

class A extends B {

}
