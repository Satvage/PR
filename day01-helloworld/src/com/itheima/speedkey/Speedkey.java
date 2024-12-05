package com.itheima.speedkey;

public class Speedkey {
    public static void main(String[] args) {
        int year = 2024;
        System.out.println(isLeapYear(year));
        System.out.println(getVerifyCode());
    }
    // 定义一个方法求闰年
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
   //定义一个方法，获取6位随机验证码
    public static String getVerifyCode() {
        String code = "";
        for (int i = 0; i < 6; i++) {
            int num = (int) (Math.random() * 10);
            code += num;
        }
        return code;
    }
}
