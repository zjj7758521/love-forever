package com.itheima.method;

public class MethodDemo6 {
    public static void main(String[] args) {

        //模拟两个长方形的长与宽（4个变量）
        double changArealength1=10.4,changAreawidth1=20.3,changArealength2=15.3,changAreawidth2=14.6;

        //先调用计算长方形面积的方法，获取到2个长方形的面积；再调用比较长方形面积的方法，将2个长方形的面积作为参数传递，获取最大长方形的面积
        double changArea1=changArea(changArealength1,changAreawidth1);
        double changArea2=changArea(changArealength2,changAreawidth2);

        double MaxChangArea=getMaxChangArea(changArea1,changArea2);

        System.out.println("2个长方形中面积最大的是："+MaxChangArea);//方法的作用的是提高代码复用率，不是提高代码的执行效率！

    }



    //定义一个方法，比较2个长方形的面积
    //分析（1）：要比较的2个长方形的面积不确定，将他们声明为参数（double changArea1,double changArea2)
    //分析（2）：比较完成之后，返回面积较大的长方形的具体面积，double
    public static double changArea(double length,double width){
        //直接将计算长方形面积的式子作为返回值返回⚠️⚠️⚠️
        return length*width;

    }

    public static double getMaxChangArea(double changArea1,double changArea2){
        if (changArea1>changArea2){

           return changArea1;

        }else {
            return changArea2;

        }

        //写法2：三元运算符
        //return changArea1>changArea2 ？changArea1：changArea2
        //当方法中使用了return，那么方法就结束了，return后面的代码就不能被执行（所以此处的方法二写到解释；里面）
    }


}
