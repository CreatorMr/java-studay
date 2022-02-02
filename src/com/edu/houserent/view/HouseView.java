package com.edu.houserent.view;

import com.edu.houserent.utils.Utility;

public class HouseView {
    private boolean loop = true; // 控制显示菜单
    private char key = ' ';// 用来接受用户选择

    // mainMenu方法，可以显示系统菜单
    public void mainMenu() {
        do {
            System.out.println("==============房屋出租系统============");
            System.out.println("\t\t\t1 新增房源");
            System.out.println("\t\t\t2 查找房屋");
            System.out.println("\t\t\t3 删除房屋信息");
            System.out.println("\t\t\t4 修改房屋信息");
            System.out.println("\t\t\t5 房屋列表");
            System.out.println("\t\t\t6 退   出");
            System.out.println("请输入1-6选择");

            key = Utility.readChar();
            switch (key) {
                case '1':
                    System.out.println("");
                    break;
                case '2':
                    System.out.println("");
                    break;
                case '3':
                    System.out.println("");
                    break;
                case '4':
                    System.out.println("");
                    break;
                case '5':
                    System.out.println("");
                    break;
                case '6':
                    System.out.println("");
                    break;
                default:
                    System.out.println("输入错误");
            }
        } while (loop);
    }
}
