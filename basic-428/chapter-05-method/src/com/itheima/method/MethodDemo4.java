package com.itheima.method;

public class MethodDemo4 {
    public static void main(String[] args) {
        //调用带有参数值的方法的格式：⚠️⚠️⚠️方法名（参数）；如果有多个参数，按照顺序，类型使用，分割之后传递
        System.out.println("----第1个需求开始------");
        int[] arr=new int[5];//动态初始化创建数组
        arrlength(arr);
        int[] arr2={100,200,300};
        arrlength(arr2);
        System.out.println("----第1个需求结束----");
        System.out.println("-----第2个需求开始");
        scoreMax(30,20);
        int numberOne =30,numberTwo=40;
        scoreMax(numberOne,numberTwo);
        System.out.println("-----第2个需求结束");
        System.out.println("-----第3个需求开始");
        zhouchang(3,4);
        System.out.println("-----第3个需求结束");
        System.out.println("-----第4个需求开始");
        yuanLength(2);
        yuanLength(3.3);

        System.out.println("-----第4个需求结束");

    }

    //1.定义一个方法，方法中打印数组的长度
    public static void arrlength(int[] arr){
        System.out.println("数组的长度是："+arr.length);

    }

    //2.定义两个值比较大小，取较大值
    public static void scoreMax(int a,int b){
        System.out.println("两个值中的较大值为："+(a>b?a:b));
    }

    //3.定义一个方法，求长方形周长
    public static void zhouchang(int c ,int d){
        System.out.println("根据长宽，知长方形的周长为："+((c+d)*2));
    }

    //4.求圆的周长
    public static void yuanLength(double f){
        System.out.println("根据长宽，知圆的面积为:"+(f *f*3.14));

    }
}
