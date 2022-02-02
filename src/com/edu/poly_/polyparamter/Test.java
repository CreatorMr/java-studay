package com.edu.poly_.polyparamter;

public class Test {
    public static void main(String[] args) {
        Worker tom = new Worker("tom", 2500);
        Manager milan = new Manager("milan", 5000, 20000);
        Test test = new Test();

        test.showEmpAnnual(tom);
        test.showEmpAnnual(milan);

        test.testWork(tom);

        test.testWork(milan);
    }

    public void showEmpAnnual(Employee e) {
        System.out.println(e.getAnnual());
    }

    public void testWork(Employee e) {
        if (e instanceof Worker) {
            ((Worker) e).work();
        } else if (e instanceof Manager) {
            ((Manager) e).manage();
        } else {
            System.out.println("不处理");
        }
    }
}
