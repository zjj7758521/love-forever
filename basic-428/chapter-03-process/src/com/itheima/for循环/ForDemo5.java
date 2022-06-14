package com.itheima.for循环;

public class ForDemo5 {
    public static void main(String[] args) {
        //求1—5之间的数字的数据和并把数据打印到控制台；

        //分析（1）：求1—5之间的数据，需要有一个值能够去表示1—5之间的每一个数据，解决方案，循环
        //求和思想：预先定义一个初始化值为0的变量，在循环的过程中让a和这个变量进行累加
        int sum = 0;
        for (int a =1;a <=5;a++){
            //第一次循环：a（1）=>sum=sum+a ;=>sum =0+1 ->sum:1
            //第二次循环：a（2）=>sum=sum+a ;=>sum =1+2 ->sum:3
            //第三次循环：a（3）=>sum=sum+a ;=>sum =3+3 ->sum:6
            //第四次循环：a（4）=>sum=sum+a ;=>sum =6+4 ->sum:10
            //第五次循环：a（5）=>sum=sum+a ;=>sum =10+5 ->sum:15

                sum +=a;
            }
        System.out.println("1—5之间的所有是3和5的倍数的数字的数据和是："+sum);

        //⚠️求和变量要定义在for循环的外面，不能在里面，原因：如果定义在里面，每次循环都会重置数据
        //⚠️for循环初始化表达式中的内容，只可以访问1次，循环就无法访问了；for循环循环体中定义的内容，循环外也无法访问
        //无法访问的原因分析：（1）作用域的角度，for虚幻{}中定义的内容，作用范围仅限于{}中（2）循环是否开始的角度，循环一次都执行不了，那么也就相当于压根声明的变量代码没有执行
        }

    }

