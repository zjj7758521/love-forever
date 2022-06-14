package com.itheima.for循环;

public class ForDemo4 {
    public static void main(String[] args) {
        //输入1—5
        for (int a = 1;a <=5;a++){
            //在循环体中可以访问到for定义的初始化语句的，a在循环体中可以被直接使用，而且a也在一直发生改变，依次变为2，3，4，5

            System.out.println(a  );
        }

        //*注意：在for循环的初始化语句中定义的内容，例如：int a ，a的作用范围仅限于循环中使用，当for循环结束之后，a就在内存中消失了
        //结论：在for循环的初始化语句中定义声明的内容在for循环外是访问不到的！

        System.out.println("=-=-=");

        //输出5-1
        for (int a = 5;a>=1;a--){
            System.out.println(a);
        }


        System.out.println("=-=-=");
        //举一反三：正着来；输出12 -  56 => 想要获取某个数字区间内的所有数字，只需要编写循环，让初始化表达式定义为起始数字，小于等于终止数字，在循环中使用a去表达每一个数字

        for (int a=12; a <= 56; a++){
            System.out.println(a );

        }

        System.out.println("=-=-=");
        //举一反三：倒着来：输出56 -  12 => 想要获取某个数字区间内的所有数字，只需要编写循环，让初始化表达式定义为起始数字，大于等于终止数字
        for (int a =56;a>=12;a--){
            System.out.println(a );
        }
    }
}
