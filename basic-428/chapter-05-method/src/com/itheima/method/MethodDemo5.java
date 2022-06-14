package com.itheima.method;

public class MethodDemo5 {
    public static void main(String[] args) {
        //有些难，重复看重复看⚠️⚠️⚠️
        //调用带有返回值方法的方式（1）直接调用，调用了之后不接收返回值（语法无误，但没有意义）
        getQuarterSales(100.3,100.4,102);

        //调用带有返回值方法的方式(2)赋值调用：⚠️⚠️⚠️返回值类型 变量名=方法名（）；调用了之后使用一个对应数据类型的变量接收
        double Quarter1Sales=getQuarterSales(100.2,103.3,110.6);
        System.out.println("1季度的销售额是："+Quarter1Sales+"万！");

        //调用带有返回值方法的方式（3）打印调用：直接将方法的调用写到打印语句中，可以直接将方法的调用返回结果进行打印
        System.out.println("2季度的销售额是"+getQuarterSales(102.2,103.4,120)+"万！");


    }

    //定义方法，计算某一季度的营业额
    //需求：求商场季度的销售额，进而求全年销售额
    //分析（1）：如果要计算某一个季度的营业额，就将该季度中三个月的单独营业额传递到方法中(double month1Sales,double month2Sales,double month3Sales)
    //分析（2）：方法的目的是获取到季度的营业额，最终想要的可以⚠️⚠️⚠️"将这个季度的营业额作为该方法调用后的返回值返回去"
    //如果返回值类型写的是void,则表示该方法没有返回值，但是现在明显是需要返回值的=>可以确定方法的返回值数据类型是double

    public static double getQuarterSales(double month1Sales,double month2Sales,double month3Sales){

        //当方法的返回值不是void，则是一个具体的数据类型的时候，就表示方法必须要返回一个数据，必须要编写return将数据返回

        double QuarterSales=month1Sales+month2Sales+month3Sales;
        return QuarterSales;
        //⚠️⚠️⚠️"将这个季度的营业额作为该方法调用后的返回值返回去"======通常是将想要获得的数据结果作为返回值返回去，和方法命名基本一致

    }
}
