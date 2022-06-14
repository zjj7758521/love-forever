package com.itheima.random;

//（1）导包
import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        //Random是一个类，也是java写好的类，拥有指定的功能（和Scanner类是一样的），Random类的功能可以生成随机数
        //创建Randomd对象，r是对象名可以变，new Random()不写任何内容
        Random r=new Random();

        //使用r对象调用方法生成一个随机数int nember=r.nextInt(边界数字）;并且方法中要传入一个int类型的边界参数
        //该方法能够生成的随机数范围：【0，边界-1】  例如：传递10 ，能生成0-9之间的随机数，传递100，能生成0-99之间的随机数

        for (int i = 0; i < 10; i++) {
            int randomNumber = r.nextInt(10);
            System.out.println("本次生成的随机数是"+randomNumber);

        }
    }
}
