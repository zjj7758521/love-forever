package com.itheima.process;

public class ForControlDemo4 {
    /*
    循环嵌套：
    在一个循环体中编写另外一个循环（两个循环嵌套执行）

   循环嵌套的核心执行逻辑：外循环进行一次，内循环进行一遍；⚠️⚠️⚠️ 循环次数为：外循环*内循环

     */

    public static void main(String[] args) {
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("本次循环i:"+i+"j:"+j);


            }

        }
    }
}
