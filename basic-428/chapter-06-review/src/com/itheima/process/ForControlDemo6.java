package com.itheima.process;

public class ForControlDemo6 {
    /*
    循环标号：
    问题：当在循环中，满足某种条件之后，想要停止指定的循环，而不是默认停止所在的循环（循环标号）
    方案：在多个循环嵌套中，可以通过break跳出指定的循环，给每一个循环起一个名字

    ⚠️⚠️起名方式：在循环声明前使用：  "名称：" 例如：（名称）out:  for(){}==>目的：可以在break的时候停止指定的循环名称
    ⚠️⚠️使用方式：break 循环名称；停止指定的循环

     */
    public static void main(String[] args) {
        //嵌套循环：
        out://起名方式： 【名称：】
        for (int minute = 0; minute <59; minute++) {
           in:
            for (int second = 0; second <=59; second++) {
                if(minute ==50&&second==35){
                    System.out.println("时间到了！起床！搬砖！");
                    //break:break执行了，默认停止的是内循环，离谁近就停止谁
                    break out;//如果加上了名称的话，就会停止谁  ⚠️⚠️使用方式：break 循环名称
                }
                System.out.println("现在是第"+minute+"分的，第"+second+"秒！");

            }

        }
    }
}
