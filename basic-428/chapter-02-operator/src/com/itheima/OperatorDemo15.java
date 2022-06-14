package com.itheima;

public class OperatorDemo15 {
    public static void main(String[] args) {
        //&&：和&的效果一样，遇false则false
        //如果&&符号左边的boolean计算出来是true，依然会计算右边（反之不计算，直接出结果）
        int a = 10;
        boolean resultOne = a % 3 ==0 & a++<20;
        System.out.println("进行了逻辑运算判断之后的a的值是："+a);

        int b = 10;
        boolean resultTwo = b  % 3 ==0 && b ++<20;
        System.out.println("进行了逻辑运算判断之后的a的值是："+b );

        //结论：&和&&得到的结果是一样的，但是&&效率更高（尽量把得到false结果的条件放在左边）



        //||：和|的效果一样，遇true则true
        //如果||符号左边的boolean计算出来是true，就不会计算右边直接出结果（反之需要再计算右边出结果）。
        int c = 18;
        boolean resultThree  = c  % 3 == 0 | c ++<20;
        System.out.println("进行了逻辑运算判断之后的c的值是："+c);

        int d =18;
        boolean resultFour = d   % 3 ==0 || d  ++<20;
        System.out.println("进行了逻辑运算判断之后的a的值是："+d  );
        //结论：|和||得到的结果是一样的，但是||效率更高（尽量把得到true结果的条件放在左边）

    }
}
