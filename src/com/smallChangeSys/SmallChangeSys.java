package com.smallChangeSys;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {

    //

    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";

        String details = "-----------零钱通明细-----------";
        // 3、完成收入入账， 完成功能驱动成员增加新的变化和代码

        double money = 0;
        double balance = 0;
        Date date = null; // date 是java内置
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm"); // 日期格式化的方法


        //消费
        // 定义新变量

        String note = "";


        do {
            System.out.println("\t============零钱通===============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退 出");

            System.out.println("请选择(1-4)");
            key = scanner.next();


            switch (key) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("收益入账金额：");
                    money = scanner.nextDouble();
                    // si思路处理，找出不正确的金额
                    // 找出不起正确的金额条件，然后给出提示， 就直接break；
                    if(money < 0) {
                        System.out.println("收益入账金额 需要 大于 0 ");
                        break;
                    }


                    balance += money;
                    date = new Date();
                    details += "\n收益入账\t +" + money + "\t" + sdf.format(date) + "";
//                    System.out.println(sdf.format(date));
                    break;
                case "3":
                    System.out.println("消费金额：");
                    money = scanner.nextDouble();
//                    money 的值范围应该检验，后续在完善


                    if(money <= 0 || money > balance) {
                        System.out.println("消费金额应该在0-" + balance);
                        break;
                    }
                    System.out.println("消费说明：");
                    note = scanner.next();
                    balance -= money;
                    // 拼接消费信息到details
                    date = new Date();
                    details += "\n" + note +  "\t-" + money + "\t"+ sdf.format((date)) + "\t" + balance;

                    break;
                case "4":
                    System.out.println("退 出");
                    //        存储选择输入的y 或 n  循环  使用while+break； 来处理接收到输入是Y或者N
                    String choice = "";
                    while(true) {
                        System.out.println("你确定要退出吗？ y/n");
                        choice = scanner.next();
                        if("y".equals(choice) || "n".equals(choice)) {
                            break;
                        }
                    }
                    // 当用户退出后，进行判断用户输入】
                    if(choice.equals("y")) {
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("选择有误，请重新选择");

            }

        } while (loop);

        System.out.println("退出了---");
    }
}
