package com.itheima;

public class OperatorDemo1 {

    /*类型转换：将一个类型的变量转换为另外一个类型.

    数据类型：限制内存空间大小=> Java为了方便操作，

    整数型： byte  short  int  long

    浮点数型：float  double

    字符型：  char

    布尔型：  boolean

    转换链（基本数据类型的层次顺序）:

    byte/short/char -> int ->long -> float -> double

    (1) 自动类型转换：将一个表示范围小的数据赋值给表示范围大的数据（转换链左——>转换链右）不需要开发者额外的编写内容.

   （2）*强制类型转换：将一个表示范围大的数据赋值给表示范围小的数据（转换链右——>转换链左），默认是不可以的，因为小的
        类型可能表示不了，强制类型转换可能会导致数据丢失精度（并不推荐使用强制类型转换）.

        如果是小数类型强制转换为整数类型，舍弃小数位，只保留整数位.


        ***格式：目标数据类型  变量名 =  （目标数据类型）要转换的值;

     */

    public static void main(String[] args) {

        //1.定义一个byte类型的数据.

        byte a = 100;

        int b = a;

        long c = a;

        double d = a;

        System.out.println("d的值是："+d);


        //2.定义一个int类型的数据.

        int numberOne  = 130;

        byte numberTwo = (byte) numberOne ;

        //:提示numberTwo的值是—126，数字不精准，故不推荐强制转换.
        System.out.println("numberTwo的值是：" +numberTwo );


        //3.定义一个double类型的数据.

        double numberThree = 13.14;

        int numberFour = (int) numberThree ;

        System.out.println("numberFour的值是："+ numberFour );

    }

}


