package com.itheima.process;

public class ForControlDemo5 {

    /*
    循环嵌套
    案例：模拟1小时中的每一份每一秒
     */
    public static void main(String[] args) {
        for (int minute = 0; minute <= 59; minute++) {
            for (int second = 0; second <=59; second++) {
                System.out.println("现在是第"+minute+"分的第"+second+"秒！");

            }

        }
    }
}
