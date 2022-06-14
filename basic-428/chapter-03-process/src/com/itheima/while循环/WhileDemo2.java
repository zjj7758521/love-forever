package com.itheima.while循环;

public class WhileDemo2 {
    public static void main(String[] args) {
        //珠峰案例练习：while外部首先声明初始化条件
        double paper =0.1;
        int zf=8844430;
        int count = 0;


        //循环的条件：当纸张的厚度小于珠峰的高度进行循环折纸的操作；⚠️本质写可以循环的条件，
        while (paper <zf){

            //进入到循环体之后，完成（1）折纸，让纸张的厚度变为原来的2倍（2）计数
            paper *=2;
            count++;
        }
        //当while结束的时候，证明paper已经大于了zf ，只需要打印count（折叠的次数）
        System.out.println("当折叠了"+count+"次之后，纸张的厚度大于了珠峰的高度！");

        //⚠️（在while条件声明的地方容易出现错误，因为下意识所想的是什么时候停止循环（paper>zf),本质写(可以循环的条件)，(paper <zf)
        //真正在写的时候，思考的是停止的条件，声明条件判断的时候应该去（将停止的条件倒过来）作为可以循环的条件。⚠️⚠️⚠️
    }
}
