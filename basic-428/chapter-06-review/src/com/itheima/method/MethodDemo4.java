package com.itheima.method;

public class MethodDemo4 {
    public static void main(String[] args) {
        int number=100;
        System.out.println("在调用change方法前，number的值是："+number);//100
        change(number);
        System.out.println("在调用change方法后，number的值是："+number);//100不变

    }

    //方法参数传递基本数据类型
    public static void change(int number){
        //当方法运行之后，将传递进来的number的数值改为200.
        number=200;
        System.out.println("(change)方法的number的值是："+number);


    }
    //结论：⚠️⚠️⚠️方法参数传递"基本数据类型"，方法调用之后形参改变，实际参数不会改变
    //自定义方法内进行的赋值，自定义的方法内的数字是形参，所赋的值只在自己定义的方法内有效
}
