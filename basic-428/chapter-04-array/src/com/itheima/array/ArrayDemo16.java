package com.itheima.array;

public class ArrayDemo16 {
    public static void main(String[] args) {
        //正常情况下无论是通过静态初始化/动态初始化创建的数组，都是在堆内存中开辟了空间，栈内存中的引用保存了堆内存中的地址值

        int[] arr=new int[3];
        System.out.println("arr保存的地址值是："+arr);//arr保存的地址值是:[I@29453f44

        //如果引用指向了一个地址，那么就可以通过索引去访问到堆内存中的数组的具体内容
        System.out.println(arr[0]);//int类型的数据0索引默认的地址值是0；

        //基础班第一天学习的常量：空常量null->  作用：用于给对象引用赋值，不可以给基本数据类型赋值
        //当一个对象引用被null赋值了之后，表示什么意思=》对象引用就不再指向任何堆内存地址了
        arr=null;

        //空指针异常出现的原因：当一个对象引用指向为null（指向为空）的时候，企图通过对象引用去访问内容，就会出现空指针异常
        System.out.println(arr[0]);//:Exception in thread "main" java.lang.NullPointerException


        //注意的是：对象引用为null（这本身并不是空指针异常出现的原因）java所允许的，当引用为null的时候企图进行访问，才会出现空指针异常

        //解决方案：重新给指向为null的对象引用一个有效的堆内存地址值（让它重新有一个具体的指向）
        arr=new int[4];//new int[4]在堆内存中开辟了空间生成了地址值再赋值给arr，就不会指向为null了。

    }
}
