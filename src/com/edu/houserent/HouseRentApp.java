package com.edu.houserent;

import com.edu.houserent.view.HouseView;

public class HouseRentApp {
    public static void main(String[] args) {
        // 创建HouseView 对象，并且显示主菜单，程序的主入口
        new HouseView().mainMenu();
        System.out.println("=========你退出了房屋出租系统==========");
    }
}
