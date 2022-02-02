package com.homework;

public class Manager extends Employee {

    private double bonus;

    // 创建manager对象时，奖金是多少并不是确定的，因为在构造器中，不给bonus可以通过setBonus
    public Manager(String name, double daySal, int workDays, double grade) {
        super(name, daySal, workDays, grade);
    }

    @Override
    public void printSal() {
        //super.printSal();
        System.out.println("经理： " + getName() + "工资是：===" + bonus + getDaySal() * getWorkDays() * getGrade());
    }


    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


}
