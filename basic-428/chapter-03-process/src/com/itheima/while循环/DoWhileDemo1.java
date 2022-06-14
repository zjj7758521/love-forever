package com.itheima.while循环;

public class DoWhileDemo1 {
    public static void main(String[] args) {
        //使用该循环打印5次你好
        //do...While循环先执行循环体，再去判断；至少执行过1次；

        int a=1;

        //先执行循环体，判断条件不受影响，先执行的循环体与判断条件没有任何关系，
        do{
            System.out.println("你好");
            a++;
        }while (a <=5);

    }
}
