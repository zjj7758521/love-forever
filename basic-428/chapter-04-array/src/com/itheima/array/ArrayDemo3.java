package com.itheima.array;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //数据类型[] 数组名称 = new 数据类型[]{元素1，元素2，元素3}；静态初始化标准格式（只指定数组内元素的 内容）⚠️⚠️⚠️⚠️不确定需要存储的数组的个数的时候，只确定什么内容的时候用静态
        //⚠️注意（1）：右侧的[]中不可以写长度
        //⚠️注意（2）：右侧的{}中的元素的数据类型和数组可以保存的元素的数据类型要匹配
        //思考：静态初始化禁止在[]中写长度？  原因：如果前面写了长度，前后长度和具体元素不一致，不能明确以哪个为准；


        //创建一个int类型的数据，可以存储多个int数据（100，200，300），名称为arrayOne.
        //创建数组的时候，长度可以写常量；
        int[] arrayOne=new int[]{100,200,300};

        int numberOne=100;
        int[] arrayFive=new int[]{numberOne,100+100,300};//静态初始化{}中可以写常量，也可以写变量名；



        boolean[] arrayTwo=new boolean[]{true,true,true,false};
        //boolean类型的默认值为false；



        double[] arrrThree=new double[]{1.1,2.2,3.3,4};
        //保存4也是没有问题的，原因：小的变大的可以自动类型转换；int转换为double类型


        char[] arrayFour=new char[]{'真','的','好','想','你'};


    }
}
