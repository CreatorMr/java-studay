package com.edu.houserent.utils;

import java.util.Scanner;

public class Utility {
    private static Scanner scanner = new Scanner(System.in);
//    public static readString() {
//        return;
//    }

    public static char readMenuSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1, false);
            c = str.charAt(0); // 将字符串转换成字符
            if (c != '1' && c != '2' && c != '3' && c != '4' && c != '5') {
                System.out.println("选择错误， 请重新输入");
            } else break;
        }
        return c;
    }

    public static char readChar() {
        String str = readKeyBoard(1, false);//就是一个字符
        return str.charAt(0);
    }

    public static char readChar(char defaultValue) {
        String str = readKeyBoard(1, true);
        return (str.length() == 0) ? defaultValue : str.charAt(0);
    }

    public static int readInt() {
        int n;
        for (; ; ) {
            String str = readKeyBoard(2, false);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.println("数字输入错误，请重新输入");
            }
        }
        return n;
    }

    public static int readInt(int defaultvalue) {
        int n;
        for (; ; ) {
            String str = readKeyBoard(10, true);
            if (str.equals("")) {
                return defaultvalue;
            }

            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.println("数字输入错误，请重新输入");
            }
        }
        return n;
    }

    public static String readString(int limit) {
        return readKeyBoard(limit, false);
    }

    public static String readString(int limit, String defaultValue) {
        String str = readKeyBoard(limit, true);
        return str.equals("") ? defaultValue : str;
    }

    public static char readConfirmSelection() {
        System.out.println("请输入你的选择(y/n)");

        char c;
        for (; ; ) {
            // 在这里将接收到的字符，转成了大写字母

            String str = readKeyBoard(1, false).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.println("选择有误，请重新输入");
            }
        }
        return c;
    }

    /**
     * @param limit
     * @param blankReturn
     * @return blankReturn 如果为true 表示可以读空字符串。
     * 如果为false 表示不能读空字符串，如果输入为空，或者输入大于limit长度，就会提示重新输入
     */
    public static String readKeyBoard(int limit, boolean blankReturn) {

        String line = "";
        // 判断有没有下一行
        while (scanner.hasNextLine()) {
            line = scanner.nextLine(); // 读取这一行

            // 如果line.length = 0; 即用户没有输入任何内容，直接回车
            if (line.length() == 0) {
                if (blankReturn) return line; // 如果blankReturn = true 可以返回空串
                else continue;
            }

            if (line.length() < 1 || line.length() > limit) {
                System.out.println("输入长度不能大于" + limit + "）请重新输入");
                continue;
            }
            break;
        }
        return line;
    }
}
