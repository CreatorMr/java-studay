package com.edu.poly_.polyparamter;

public class Worker extends Employee {
    public Worker(String name, double salary){
        super(name, salary);
    }

    public void  work() {
        System.out.println("普通员工工作");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
