package com.itheima.random;

import java.util.Random;

public class RandomDemo2 {
    public static void main(String[] args) {
        Random r=new Random();

        int randomNumberOne = r.nextInt();
        System.out.println("不传递参数获取到的随机数是："+randomNumberOne );

        //public int nextInt(int bounds):返回一个0到参数-1之间的随机数
        //⚠️想要生成指定范围的随机数：指定范围（上边界/下边界）10——20   10：下边界 20：上边界
        //⚠️⚠️⚠️int result=r.nextInt(上边界-下边界+1)+下边界；
        int result = r.nextInt(11)+10;
    }
}
