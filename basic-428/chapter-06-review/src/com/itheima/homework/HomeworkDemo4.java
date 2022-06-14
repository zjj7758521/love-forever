package com.itheima.homework;

public class HomeworkDemo4 {
    public static void main(String[] args) {
        /*
        作业练习4需求:
        使用循环嵌套打印钟表时间,每天24小时,每小时60分钟,显示格式如下:
        0点0分
        0点1分
		.....
        0点59分
        1点0分
		...
		*/

        for (int hour = 0; hour < 24; hour++) {//外循环控制小时
            for (int minute = 0; minute < 60; minute++) {//内循环控制分钟
                System.out.println("现在是"+hour+"点"+minute+"分！");
                //打印语句要写在内循环里面，否则获取不到"+minute"的值；⚠️


            }


        }
        //嵌套循环次数为"外循环*内循环"次数，逻辑为外循环一次，内循环一遍；⚠️⚠️⚠️

    }
}
