package com.itheima.process;

public class ForControlDemo2 {
    /*
    循环控制：
    break（破坏）：在循环中使用=》结束循环（无论是否可以继续循环，直接结束循环）⚠️⚠️

    特点：不推荐在循环中直接写berak，搭配判断使用，⚠️⚠️当满足某种条件时，直接结束循环（可以是正常循环，也可以是死循环）

    ==》break和return的区别是什么？如果是break，那么只结束循环，循环后面的代码依然可以运行
    如果是return，表示整个方法都结束了，后面的代码不会运行

    区别：结束的范围不一样！break只针对循环，return针对当前方法！一般情况下没有返回值的情况下尽量不去使用return⚠️⚠️⚠️



     */





    public static void main(String[] args) {
        int[] intArray={10,20,30,10,20,30,10,10};
        int target=30;
        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i]==target){
                System.out.println("目标值target在数组中第一次出现的索引是"+i);
                break;//如果找到了target目标值在数组中第一次出现的索引，那么直接结束循环即可
            }

        }
        System.out.println("看这几句话是否可以打印");

    }
}
