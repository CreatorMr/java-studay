package com.edu.poly_.polyarr;

public class PloyArray {

    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("jack", 20);
        persons[1] = new Student("jack", 18, 100);
        persons[2] = new Student("smith", 21, 30.1);
        persons[3] = new Teacher("scott", 40, 40000);
        persons[4] = new Teacher("king", 30, 20000);

        //循环遍历多态数组， 调用say方法
        for (int i = 0; i < persons.length; i++) {
            // persons[i] 编译类型是person 运行类型根据实例情况
            System.out.println(persons[i].say());
            if (persons[i] instanceof Student) {
                ((Student) persons[i]).study();
            } else if (persons[i] instanceof Teacher) {
                ((Teacher) persons[i]).teach();
            } else {
                System.out.println("类型有误，请自己检查");
            }
        }
    }

}
